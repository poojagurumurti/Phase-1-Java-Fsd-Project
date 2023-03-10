package com.lockedme;

public class LockedMeMain {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("mainLock");
		
		MenuOptions.printWelcomeScreen("LockedMe", "Pooja Gurumurti Tamragouri");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}
