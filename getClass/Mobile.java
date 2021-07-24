class Mobile{
	
	private AppsDTO[] apps;
	private int index;
	
	public Mobile(int size){
		apps = new AppsDTO[size];
	}
	
	public boolean createApps(AppsDTO apps){
		boolean dataCreated = false;
		System.out.println("invoked createApps()");
		if(apps != null){
			if(apps.getName() != null && apps.getAppsId() > 0){
				this.apps[index] = apps;
				index++;
				dataCreated = true;
			}else{
				System.out.println("Id must be greater than zero");
			}
		}else{
			System.out.println("Apps DTO object not found");
		}
		return dataCreated;
	}
	
	public void getApps(){
		System.out.println("invoked getApps()");
		for(AppsDTO appDTO : apps){
			if(appDTO != null){
				System.out.println(appDTO.getAppsId()+", "+ appDTO.getName()+", "+ appDTO.getType()+", "+ appDTO.getSizeInMb());
			}else{
				System.out.println("Apps DTO object not found");
			}
		}
	}
	
	public boolean updateAppSizeByName(String size, String name){
		boolean sizeUpdated = false;
		System.out.println("invoked updateSizeByName");
		for(AppsDTO dto : apps){
			if(size != null && name != null){
				if(name.equals(dto.getName())){
					dto.setSizeInMb(size);
					sizeUpdated = true;
				}else{
					System.out.println(name + "not found");
				}
			}else{
				System.out.println("size and name are empty");
			}
		}
		return sizeUpdated;
	}
	
	//getAppsById
	/*public String getAppById(String name, int appsId){
		System.out.println("invoked getAppsById");
		for(AppsDTO appsdto : apps){
			if(appsdto != null){
				if(appsId.equals(appsdto.getAppsId()){
					System
				}
		}
		return name;
	}*/
	//getAppsByInternet
	//getAppsByType
}