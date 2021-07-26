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
		System.out.println("invoked updateSizeByName method");
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
	
	public boolean deleteAppDetailsByAppsId(int appsId){
		boolean appDeleted = false;
		System.out.println("invoked deleteAppDetailsByAppsId method");
		for(AppsDTO ad : apps){
			if(ad != null){
				if(appsId == ad.getAppsId()){
					ad = null;
					appDeleted = true;
				}else{
					System.out.println(appsId +" not found");
				}
			}else{
				System.out.println("Application details is empty");
			}
		}
		return appDeleted;
	}
	
	//getAppsById
	public String getAppById(String name, int appsId){
		System.out.println("invoked getAppsById method");
		for(AppsDTO appsdto : apps){
			if(appsdto != null){
				if(appsId == appsdto.getAppsId()){
					System.out.println(appsdto.getName());
				}else{
					System.out.println("Application with is "+appsId+" not found");
				}
			}else{
				System.out.println("Application details is empty");
			}
		}
		return name;
	}
	
	//getAppsByInternet
	public String getAppByInternetRequired(String name, boolean internetRequired){
		System.out.println("invoked getAppByInternetRequired method");
		for(AppsDTO adto : apps){
			if(adto != null){
				if(internetRequired == adto.getInternetRequired()){
					System.out.println("Application : " +adto.getName());
				}else{
					System.out.println("Application not found");
				}
			}else{
				System.out.println("Application details is empty");
			}
		}
		return name;
	}
	
	//getAppsByType
	public String getAppsByType(String name, String type){
		System.out.println("invoked getAppsByType method");
		for(AppsDTO app : apps){
			if(app != null){
				if(type.equals(app.getType())){
					System.out.println("Application :" +app.getName());
				}else{
					System.out.println("Application type "+type+" not found");
				}
			}else{
				System.out.println("Application details is empty");
			}
		}
		return name;
	}
}