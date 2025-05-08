package com.LTM.pages;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.PageFactory.utility;

public class TemplateManagerSoftwareDeployment_Page 
{
public WebDriver wd;
	
    
	public TemplateManagerSoftwareDeployment_Page(WebDriver wd) 
    {
 	   this.wd = wd;
 	   wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	   PageFactory.initElements(wd, this);
    }
	
	
	//Module Software Deployment
    
    	@FindBy(linkText = "Software Deployment")
    	WebElement clicksoftwaredeployment;
    
	//file transfer
		@FindBy(linkText = "File Transfer")
		WebElement FileTransfer;
		
		@FindBy(xpath = "//input[@id='WinFileTransfertxtTargetFolderPath']") 
		WebElement txtFileFolderPath; //C:
		
		@FindBy(xpath = "//select[@id='winFileTransferSourcedrp']")
		WebElement ddFileSource; //by index 0,1,2
		
		@FindBy(xpath = "//select[@id='winFileTransferSourceTypedrp']")
		WebElement ddFileSourceType; //by index 0,1,2
		
		@FindBy(xpath = "//input[@id='WinFileTransferfileUpload']")
		WebElement FileUpload; 
		
		@FindBy(xpath = "//input[@id='WinFileTransferbtnUploads']")
		WebElement btnUploadFile;

		@FindBy(xpath = "//input[@id='WinFileTransferchkFileExecute']")
		WebElement chkExecuteFile;
		
		@FindBy(xpath = "//input[@id='WinFileTransfertxtCommandLine']")
		WebElement txtFileCommandParameter;
		
		@FindBy(xpath = "//input[@id='WinFileTransferidRebootRequired']")
		WebElement chkSkip5File;
			
		@FindBy(xpath = "WinFileTransferbtnFTApplyJQ")
		WebElement btnSaveFile;
		
		@FindBy(xpath = "//button[@id='WinFileTransferbtnClear']")
		WebElement btnClearFileTransfer;
		
	//Folder Transfer
		@FindBy(xpath = "//label[@id='WinFileTransferlnkbtnfolder']")
		WebElement tabFolderTransfer;
		
		@FindBy(xpath = "//input[@id='WinFileTransfertxtTargetFolderPath']")
		WebElement txtFolderFolderPath;
		
		@FindBy(xpath = "//select[@id='winFileTransferSourcedrp']")
		WebElement ddFolderSource;

		@FindBy(xpath = "//select[@id='winFileTransferSourceTypedrp']")
		WebElement ddFolderSourceType;
		
		@FindBy(xpath = "//select[@id='winFileTransferNamedrp']")
		WebElement ddFilename;
		
		
		@FindBy(xpath = "//input[@id='WinFileTransferfileUpload']")
		WebElement btnFolderUpload;
		
		@FindBy(xpath = "//input[@id='WinFileTransferbtnUploads']")
		WebElement btnUploadFolder;
		
		@FindBy(xpath = "//input[@id='WinFileTransferchkBatchExecution']")
		WebElement chkBatchExecution;
		
		@FindBy(xpath = "//input[@id='WinFileTransferidRebootRequired']")
		WebElement chkskip5Folder;
		
		@FindBy(xpath = "//input[@id='WinFileTransferbtnFTApplyJQ']")
		WebElement btnSaveFolder;
		
		@FindBy(xpath = "//button[@id='WinFileTransferbtnClear']")
		WebElement btnClearFolder;

	//Import File	
		@FindBy(linkText = "Import File")
		WebElement labelImportFile;
		
		@FindBy(xpath = "//select[@id='WindowsImportFileddlSourceType']")
		WebElement ddSourceTypeImportFile;
		
		@FindBy(xpath = "//select[@id='WindowsImportFileddlSource']")
		WebElement ddSourceimportFile;
		
		@FindBy(xpath = "//input[@id='WindowsImportFilePathTxt']")
		WebElement txtFilePathImportFile;
		
		@FindBy(xpath = "//input[@id='btnApplyWindowsImportFile']")
		WebElement btnSaveImportFile;

	//Import Folder	
		@FindBy(xpath = "//label[@id='WindowsImportFile_lilblImportFolder']")
		WebElement tabImportFolder;
		
		@FindBy(xpath = "//select[@id='WindowsImportFileddlSourceType']")
		WebElement ddSourceTypeImportFolder;
		
		@FindBy(xpath = "//select[@id='WindowsImportFileddlSource']")
		WebElement ddSourceImportFolder;
		
		@FindBy(xpath = "//input[@id='txtWindowsImportFolderPath']")
		WebElement txtFolderPathImportFolder;
		
		@FindBy(xpath = "//input[@id='btnApplyWindowsImportFile']")
		WebElement btnSaveimportFolder;
		
	//Folder Synchronization
		@FindBy(xpath = "//label[@id='WindowsImportFile_lilblFolderSync']")
		WebElement tabFolderSync;
		
		@FindBy(xpath = "//input[@id='WindowsImportFile_txtFolderSyncPath']")
		WebElement txtFolderSyncPath;
		
		@FindBy(xpath = "//input[@id='WindowsImportFile_ADDFolderSyncPath']")
		WebElement btnAddFilderSync;
		
		@FindBy(xpath = "//input[@id='WindowsImportFile_btnFolderSyncApply']")
		WebElement btnSaveFolderSync;

	//Software & Patch install / uninstall	
		@FindBy(linkText = "Software & Patch Install/Uninstall")
		WebElement clickSoftInstall;
		
		@FindBy(xpath = "//input[@id='XPSoftwareUpgrade_btnNewInstall']")
		WebElement btnNewInstall;
		
		@FindBy(xpath = "//select[@id='XPSoftwareUpgrade_ddlSourceType']")
		WebElement ddSourceTypeSoftInstall; //Select by index 0,2
		
		@FindBy(xpath = "//select[@id='XPSoftwareUpgrade_ddlSource']")
		WebElement ddSourceSoftInstall; //Select by index 0,1,2
		
		@FindBy(xpath = "//select[@id='XPSoftwareUpgrade_ddlFile']")
		WebElement ddFileSoftInstall; //Select by index

		@FindBy(xpath = "//input[@id='btnVldtCnnctnsoftwarePatechXP']")
		WebElement btnValidateConnSoftInstall; 

		@FindBy(xpath = "//input[@id='XPSoftwareUpgrade_txtParameter']")
		WebElement txtParameterSoftInstall;

		@FindBy(xpath = "//input[@id='XPSoftwareUpgrade_InstallidRebootRequired']")
		WebElement chkskip5SoftInstall;

		@FindBy(xpath = "//input[@id='XPSoftwareUpgrade_btnInstall']")
		WebElement btnSaveSoftInstall;

		@FindBy(xpath = "//input[@id='XPSoftwareUpgrade_btnCancels']")
		WebElement btnCloseSoftInstall;

	//uninstall	
		
		@FindBy(xpath = "//input[@aria-controls='XPSoftwareUpgrade_tblHeaderInstalledSoft']")
		WebElement SearchboxSoftInstall; //Google Chrome

		@FindBy(xpath = "//input[@id='Google Chrome']")
		WebElement chkSoftUninstall;

		@FindBy(xpath = "//input[@id='XPSoftwareUpgrade_btnInstallDelete']")
		WebElement btnUninstall;
		
		
		@FindBy (xpath = "//span[@id='spnalltemplate']")
		WebElement taballtemp;
		
		@FindBy (xpath = "//i[@class='fa fa-plus font-white']")
		WebElement btnaddtemp;
		
		@FindBy (xpath = "//input[@id='ContentPlaceHolder1_txtTemplateName']")
		WebElement txttemplatename;
		
		@FindBy (xpath = "//select[@id='ddlostype']")
		WebElement ddostype;
		
		@FindBy (xpath = "//select[@id='ddlTemplateType']")
		WebElement ddschtype;
		
		@FindBy (xpath = "//textarea[@id='ContentPlaceHolder1_txtAddMessage_CreTem']")
		WebElement txttemostartmsg;
		
		@FindBy (xpath = "//select[@id='ddlTMPostponedDisplayTime']")
		WebElement dddispalytime;
		
		@FindBy (xpath = "//input[@id='ContentPlaceHolder1_btnCreateTemplate']")
		WebElement btnsave;
		
		public void Create_Template_Software_Deployment() 
		{
			taballtemp.click();
			if(utility.isClicked(btnaddtemp)==true)
			//btnaddtemp.click();
			txttemplatename.sendKeys("Template_Software_Deployment");
			
			Select os_type=new Select(ddostype);
			os_type.selectByVisibleText("Windows");
			
			Select Sch_type=new Select(ddschtype);
			Sch_type.selectByIndex(0);
			
			Select Dis_type=new Select(dddispalytime);
			Dis_type.selectByIndex(0);
			
			btnsave.click();
			taballtemp.click();
			
			clicksoftwaredeployment.click();
			FileTransfer.click();
			txtFolderFolderPath.sendKeys("");
			
			Select drop_import=new Select(ddFolderSource);
			drop_import.selectByIndex(1);
			
			Select Source_import=new Select(ddFolderSourceType);
			Source_import.selectByIndex(1);
			
			Select File_import=new Select(ddFilename);
			File_import.selectByIndex(1);
			
			
			
			
			
			
		}


}
