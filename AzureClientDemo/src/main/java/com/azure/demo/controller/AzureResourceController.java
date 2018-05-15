package com.azure.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.demo.VMData;
import com.azure.demo.model.AARecommendations;
import com.azure.demo.model.OperationEntityListResult;
import com.azure.demo.model.RateCardTokenResponse;
import com.azure.demo.model.ResourceListResult;
import com.azure.demo.service.AzureService;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.Azure;
import com.microsoft.azure.management.compute.VirtualMachine;

@RestController
public class AzureResourceController {

	@Autowired
	AzureService azureService;

	@GetMapping("/sid")
	public String getSubscriptionId() throws CloudException, IOException {
		Azure azure = azureService.getAzureEntry();
		if (azure == null) {
			return "Authentication not completed";
		} else {
			return azure.subscriptionId();
		}
	}

	@GetMapping("/vms")
	public Object getAllVirtaulMachines() throws CloudException, IOException {
		Azure azure = azureService.getAzureEntry();
		if (azure != null) {
			List<VirtualMachine> vmList = azure.virtualMachines().list();
			List<VMData> vms = new ArrayList<>();
			for (VirtualMachine vm : vmList) {
				VMData vmData = new VMData();
				vmData.setId(vm.vmId());
				vmData.setName(vm.name());
				vmData.setType(vm.type());
				vmData.setResourceGroup(vm.resourceGroupName());
				vmData.setLocation(vm.regionName());
				vmData.setIpaddress(vm.getPrimaryPublicIPAddress().ipAddress());
				vms.add(vmData);
			}
			return vms;
		} else {
			return "Sorry! Authentication not completed";
		}
	}
	
	@GetMapping("/resources")
	public ResourceListResult getAllResources() {
		RateCardTokenResponse rateCardTokenResponse = azureService.generateAzureTocken();
		ResourceListResult resourceListResult = azureService.getResourceListResult(rateCardTokenResponse);
		return resourceListResult;
	}
	
	@GetMapping("/advices")
	public OperationEntityListResult getAdvices() {
		RateCardTokenResponse rateCardTokenResponse = azureService.generateAzureTocken();
		OperationEntityListResult operationEntityListResult = azureService.getOperationEntities(rateCardTokenResponse);
		return operationEntityListResult;
	}
	
	@GetMapping("/recommendations")
	public AARecommendations getAzureAdvisorRecommenadations() {
		RateCardTokenResponse rateCardTokenResponse = azureService.generateAzureTocken();
		AARecommendations recommendations = azureService.getAdviserRecommendations(rateCardTokenResponse);
		return recommendations;
	}
}
