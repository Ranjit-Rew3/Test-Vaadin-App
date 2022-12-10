package org.vaadin.examples.form.ui.client;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import org.vaadin.examples.form.data.model.CommonEnums;

public class ClientForm extends FormLayout {
    private TextField firstname;
    private TextField lastName;
    private EmailField email;
    private NumberField mobileNumber;
    private Select<String> gender;
    private Select<String> district;
    private TextField address;

    private TextField province;
    private Select<String> appointmentDistrict;
    private TextField location;
    private DatePicker dobInAd;
    private TextField dobInBs;

    private TextField fatherFName;
    private TextField fatherLName;
    private TextField motherFName;
    private TextField motherLName;

    private TextField NIN;
    private TextField citizenshipNumber;
    private Select<String> issueDistrict;
    private TextField dateOfIssue;

    //Applicant's Contact Details
    private Select<CommonEnums.Province> applicantsProvince;
    private Select<String> applicantsDistrict;
    private Select<String> applicantsMunicipality;
    private TextField applicantsWardNo;
    private TextField applicantsVillage;

    // Contact Details
    private TextField contactFName;
    private TextField contactLName;
    private Select<String> contactDistrict;
    private Select<CommonEnums.Province> contactProvince;
    private Select<String> contactMunicipality;
    private TextField contactWardNo;
    private TextField contactVillage;

    private Upload citizenshipFrontUpload;
    private Upload citizenshipBackUpload;
    private Upload marriageCertificate;
    private Button selectCitizenshipFrontButton;
    private Button selectCitizenshipLastButton;
    private Button marriageCertificateButton;
    MemoryBuffer buffer;

    private Checkbox newDoc;
    private Checkbox renew;
    private Checkbox lost;
    private Checkbox damaged;

    private TextField from;



    public ClientForm(){
        initializeForm();
    }

    private void initializeForm(){
        initializeFields();
        this.getStyle().set("display","flex");
        this.getStyle().set("flex-direction","column");

        // Appointment Center
        Div appointmentCenterMainDiv = new Div();
        appointmentCenterMainDiv.getStyle().set("padding","18px");
        Div divForLabel = new Div();
        divForLabel.getStyle().set("background","#edeff1");
        Label appointmentCenterLabel = new Label("Appointment Center");
        divForLabel.add(appointmentCenterLabel);
        appointmentCenterMainDiv.add(divForLabel);
        //appointmentCenterMainDiv.getStyle().set("display","flex");
        Div appointmentCenter = new Div();
        appointmentCenter.getStyle().set("background","#FFFFFF");
        appointmentCenter.getStyle().set("display", "flex");
        appointmentCenter.getStyle().set("column-gap", "10px");

        appointmentCenter.add(province,appointmentDistrict,location);
        appointmentCenterMainDiv.add(appointmentCenter);
        this.add(appointmentCenterMainDiv);

        //Demographic Information
        Div demographicInfoMainDiv = new Div();
        //demographicInfoMainDiv.getStyle().set("padding","18px");
        Div demographicLabelDiv = new Div();
        demographicLabelDiv.getStyle().set("background","#edeff1");
        Label demographicLabel = new Label("Demographic Information");
        demographicLabelDiv.add(demographicLabel);
        demographicInfoMainDiv.add(demographicLabelDiv);

        Div demographicFirstRow = new Div();
        demographicFirstRow.getStyle().set("background","#FFFFFF");
        demographicFirstRow.getStyle().set("display", "flex");
        demographicFirstRow.getStyle().set("column-gap", "10px");
        demographicFirstRow.add(firstname,lastName,mobileNumber);

        Div demographicSecondRow = new Div();
        demographicSecondRow.getStyle().set("background","#FFFFFF");
        demographicSecondRow.getStyle().set("display", "flex");
        demographicSecondRow.getStyle().set("column-gap", "10px");
        demographicSecondRow.add(gender,district,dobInAd,dobInBs);

        Div demographicLastRow = new Div();
        demographicLastRow.getStyle().set("background","#FFFFFF");
        demographicLastRow.getStyle().set("display", "flex");
        demographicLastRow.getStyle().set("column-gap", "10px");
        demographicLastRow.add(fatherFName,fatherLName,motherFName,motherLName);

        demographicInfoMainDiv.add(demographicFirstRow,demographicSecondRow,demographicLastRow);
        this.add(demographicInfoMainDiv);

        // Citizenship Information
        Div citizenshipInfoMainDiv = new Div();
        citizenshipInfoMainDiv.getStyle().set("padding","18px");
        Div citiznDivForLabel = new Div();
        citiznDivForLabel.getStyle().set("background","#edeff1");
        Label citizenInfoLabel = new Label("Citizenship Information");
        citiznDivForLabel.add(citizenInfoLabel);
        citizenshipInfoMainDiv.add(citiznDivForLabel);
        //appointmentCenterMainDiv.getStyle().set("display","flex");
        Div citizenshipInfo = new Div();
        citizenshipInfo.getStyle().set("background","#FFFFFF");
        citizenshipInfo.getStyle().set("display", "flex");
        citizenshipInfo.getStyle().set("column-gap", "10px");

        citizenshipInfo.add(NIN,citizenshipNumber,issueDistrict,dateOfIssue);
        citizenshipInfoMainDiv.add(citizenshipInfo);
        this.add(citizenshipInfoMainDiv);

        // Applicant's Contact Details
        Div contactDetailsMainDiv = new Div();
        //contactDetailsMainDiv.getStyle().set("padding","18px");
        Div contactDetailsDivForLabel = new Div();
        contactDetailsDivForLabel.getStyle().set("background","#edeff1");
        Label contactDetailsLabel = new Label("Applicant's Contact Details");
        contactDetailsDivForLabel.add(contactDetailsLabel);
        contactDetailsMainDiv.add(contactDetailsDivForLabel);

        Div contactDetailsFirstRow = new Div();
        contactDetailsFirstRow.getStyle().set("background","#FFFFFF");
        contactDetailsFirstRow.getStyle().set("display", "flex");
        contactDetailsFirstRow.getStyle().set("column-gap", "10px");
        contactDetailsFirstRow.add(applicantsProvince,applicantsDistrict);

        Div contactDetailsSecondRow = new Div();
        contactDetailsSecondRow.getStyle().set("background","#FFFFFF");
        contactDetailsSecondRow.getStyle().set("display", "flex");
        contactDetailsSecondRow.getStyle().set("column-gap", "10px");
        contactDetailsSecondRow.add(applicantsMunicipality,applicantsWardNo,applicantsVillage);

        contactDetailsMainDiv.add(contactDetailsFirstRow,contactDetailsSecondRow);
        this.add(contactDetailsMainDiv);

        // Contact Details in Case of Emergency
        Div emergencyContactDetailsMainDiv = new Div();
        emergencyContactDetailsMainDiv.getStyle().set("padding","18px");
        Div emergencyContactDetailsDivForLabel = new Div();
        emergencyContactDetailsDivForLabel.getStyle().set("background","#edeff1");
        Label emergencyContactDetailsLabel = new Label("Contact Details in case of Emergency");
        emergencyContactDetailsDivForLabel.add(emergencyContactDetailsLabel);
        emergencyContactDetailsMainDiv.add(emergencyContactDetailsDivForLabel);

        Div emergencyContactDetailsFirstRow = new Div();
        emergencyContactDetailsFirstRow.getStyle().set("background","#FFFFFF");
        emergencyContactDetailsFirstRow.getStyle().set("display", "flex");
        emergencyContactDetailsFirstRow.getStyle().set("column-gap", "10px");
        emergencyContactDetailsFirstRow.add(contactFName,contactLName);

        Div emergencyContactDetailsSecondRow = new Div();
        emergencyContactDetailsSecondRow.getStyle().set("background","#FFFFFF");
        emergencyContactDetailsSecondRow.getStyle().set("display", "flex");
        emergencyContactDetailsSecondRow.getStyle().set("column-gap", "10px");
        emergencyContactDetailsSecondRow.add(contactProvince,contactDistrict);

        Div emergencyContactDetailsThirdRow = new Div();
        emergencyContactDetailsThirdRow.getStyle().set("background","#FFFFFF");
        emergencyContactDetailsThirdRow.getStyle().set("display", "flex");
        emergencyContactDetailsThirdRow.getStyle().set("column-gap", "10px");
        emergencyContactDetailsThirdRow.add(contactMunicipality,contactWardNo,contactVillage);

        emergencyContactDetailsMainDiv.add(emergencyContactDetailsFirstRow,emergencyContactDetailsSecondRow,emergencyContactDetailsThirdRow);
        this.add(emergencyContactDetailsMainDiv);


        Div documentsMainDiv = new Div();
        documentsMainDiv.getStyle().set("padding","18px");
        documentsMainDiv.getStyle().set("display", "flex");
        documentsMainDiv.getStyle().set("column-gap", "10px");

        selectCitizenshipFrontButton = new Button("Citizenship Front");
        //selectCitizenshipFrontButton.getStyle().set("padding-right","10px");
        selectCitizenshipLastButton = new Button("Citizenship Back");
        //selectCitizenshipLastButton.getStyle().set("padding-right","10px");
        marriageCertificateButton = new Button("Marriage Certificate");
        // marriageCertificateButton.getStyle().set("padding-right","10px");

        citizenshipFrontUpload.setUploadButton(selectCitizenshipFrontButton);
        citizenshipBackUpload.setUploadButton(selectCitizenshipLastButton);
        marriageCertificate.setUploadButton(marriageCertificateButton);
       /* citizenshipFrontUpload.setAutoUpload(false);
        citizenshipFrontUpload.setDropAllowed(false);
        citizenshipFrontUpload.setReceiver(buffer);

        citizenshipBackUpload.setAutoUpload(false);
        citizenshipBackUpload.setDropAllowed(false);
        citizenshipBackUpload.setReceiver(buffer);

        marriageCertificate.setAutoUpload(false);
        marriageCertificate.setDropAllowed(false);
        marriageCertificate.setReceiver(buffer);*/
        documentsMainDiv.add(selectCitizenshipFrontButton,selectCitizenshipLastButton,marriageCertificateButton);
        this.add(documentsMainDiv);

        Div lastDiv = new Div();
        lastDiv.getStyle().set("padding","18px");
        lastDiv.getStyle().set("display", "flex");
        lastDiv.getStyle().set("column-gap", "10px");

        Div lastDivRow = new Div();
        lastDivRow.getStyle().set("background","#FFFFFF");
        lastDivRow.getStyle().set("display", "flex");
        lastDivRow.getStyle().set("column-gap", "10px");
        lastDivRow.add(from);

        lastDiv.add(lastDivRow);
        this.add(lastDiv);

        Div checkBoxDiv = new Div();
        checkBoxDiv.getStyle().set("column-gap", "10px");
        checkBoxDiv.getStyle().set("display","flex");
        checkBoxDiv.add(newDoc,lost,renew,damaged);
        this.add(checkBoxDiv);

    }

    private void initializeFields() {
        firstname = new TextField("First Name");
        lastName = new TextField("Last Name");
        email = new EmailField("Email");
        address = new TextField("Address");
        gender = new Select<>("Male","Female");
        gender.setLabel("Gender");
        district = new Select<>();
        district.setItems(new CommonEnums().municipalityAndDistrictMapping.keySet());
        district.setLabel("District");
        appointmentDistrict = new Select<>();
        appointmentDistrict.setItems(new CommonEnums().municipalityAndDistrictMapping.keySet());
        appointmentDistrict.setLabel("District");
        dobInAd = new DatePicker("DOB in AD");
        dobInBs = new TextField("DOB in BS");
        dobInBs.setPlaceholder("YYYYMMDD");
        fatherFName = new TextField("Father's First Name");
        fatherLName = new TextField("Father's Last Name");
        motherFName = new TextField("Mother's First Name");
        motherLName = new TextField("Mother's Last Name");
        province = new TextField("Province");
        location = new TextField("Location");
        mobileNumber = new NumberField("Mobile Number");
        //this.add(firstname,lastName,email,address);

        NIN = new TextField("NIN");
        citizenshipNumber = new TextField("Citizenship Number");
        issueDistrict = new Select<>();
        issueDistrict.setItems(new CommonEnums().municipalityAndDistrictMapping.keySet());
        issueDistrict.setLabel("Issue District");
        dateOfIssue = new TextField("Date of issue");
        dateOfIssue.setPlaceholder("YYYYMMDD");

        applicantsProvince = new Select<>();
        applicantsProvince.setLabel("Province");
        applicantsProvince.setItems(CommonEnums.Province.values());
        applicantsDistrict = new Select<>();
        applicantsDistrict.setLabel("District");
        //applicantsDistrict.setItems(District.values());
        applicantsProvince.addValueChangeListener(e -> {
            applicantsDistrict.setItems(new CommonEnums().provinceAndDistrictMapping.get(e.getValue().name()));
        });
        applicantsMunicipality = new Select<>();
        applicantsMunicipality.setLabel("Municipality");
        applicantsDistrict.addValueChangeListener(e -> {
            applicantsMunicipality.setItems(new CommonEnums().municipalityAndDistrictMapping.get(e.getValue()));
        });
        applicantsWardNo = new TextField("Ward No");
        applicantsVillage = new TextField("Street/Village");

        contactFName = new TextField("First Name");
        contactLName = new TextField("Last Name");
        contactProvince = new Select<>();
        contactProvince.setLabel("Province");
        contactProvince.setItems(CommonEnums.Province.values());
        contactDistrict = new Select<>();
        contactDistrict.setLabel("District");
        contactProvince.addValueChangeListener(e -> {
            applicantsDistrict.setItems(new CommonEnums().provinceAndDistrictMapping.get(e.getValue().name()));
        });
        contactMunicipality = new Select<>();
        contactMunicipality.setLabel("Municipality");
        contactDistrict.addValueChangeListener(e -> {
            applicantsMunicipality.setItems(new CommonEnums().municipalityAndDistrictMapping.get(e.getValue()));
        });
        contactWardNo = new TextField("Ward No");
        contactVillage = new TextField("Street/Village");

        buffer = new MemoryBuffer();
        citizenshipFrontUpload = new Upload(buffer);
        marriageCertificate = new Upload(buffer);
        citizenshipBackUpload = new Upload(buffer);

        newDoc = new Checkbox("New");
        renew = new Checkbox("Renew");
        lost = new Checkbox("Lost");
        damaged = new Checkbox("Damaged");

        from = new TextField("From");
    }
}
