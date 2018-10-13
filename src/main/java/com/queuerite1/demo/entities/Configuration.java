package com.queuerite1.demo.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Configuration {
    private long id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean valid;
    private Integer adRefreshInterval;
    private Boolean allowDuplicateCounterNumber;
    private String branchCode;
    private Integer callInterval;
    private String callPrefix;
    private String callSection;
    private String callSuffix;
    private String companyFolder;
    private String companyName;
    private String dateFormat;
    private String displayAccouncement;
    private String displayJsp;
    private String end;
    private Boolean excludeReadCounter;
    private String fiveButtonPrinterComPort;
    private String generateJsp;
    private String generateQueueSmsMessage;
    private Boolean hasGenerateQueueSms;
    private Boolean hasImageHeader;
    private Boolean hasInitialSound;
    private Boolean hasNoTransactionEntries;
    private Boolean hasPostSound;
    private Boolean hasQueueStatusSms;
    private Boolean hasSeniorPatient;
    private Boolean hasTextHeader;
    private Boolean hasTransactions;
    private Boolean hideTheTime;
    private String imageHeaderLocation;
    private Boolean includeDescriptionOnQueueTransaction;
    private Boolean includeStandbyInProcessing;
    private Boolean inputQueueNotes;
    private Boolean isFiveButtonPrinterEnabled;
    private Boolean isSoundBell;
    private String localeCode;
    private Integer maxNowServing;
    private Boolean multipleTransactionTitle;
    private Integer noShowTime;
    private String printHeader;
    private String queueStatusSmsMessage;
    private Boolean readAsWhole;
    private Boolean readCountersAsWhole;
    private String receptionTitle;
    private Integer recipientPositionForQueueStatusSms;
    private Integer recipientSizeOfQueueStatusSms;
    private Integer repeatCall;
    private Boolean requireTransactions;
    private Boolean showDataInsteadOfNumber;
    private Boolean showNullOnQueueTransaction;
    private String smsComPort;
    private String smsMessageCenterNumber;
    private String smsNumber;
    private String start;
    private String tabularData;
    private String tellerIdentificationType;
    private Boolean transactionMapToService;
    private Boolean transferBySection;
    private String tvStreamBroadcastAddress;
    private String tvStreamPort;
    private String tvStreamSourceAddress;
    private String webServiceIp;
    private String botswanaWebSmsPassword;
    private String botswanaWebSmsUsername;
    private Boolean canDownloadDataReport;
    private Boolean canDownloadQueueListOnCaller;
    private Boolean canGroupServices;
    private Boolean canMultiLoginCaller;
    private Boolean canQueueFromSms;
    private String clickatellApikey;
    private String contactNumber;
    private Boolean createVideoListFromVideoFolderFiles;
    private Boolean disableCallerEditName;
    private Boolean disabledCallerAlertMessage;
    private Boolean enableLdap;
    private Boolean generateQueueOnCall;
    private String generateQueueSmsMessagePart2;
    private Boolean hasBreakFunction;
    private Boolean hasOngoingQueueSms;
    private Boolean hasOngoingQueueSms2;
    private Boolean hideSettingsOnCaller;
    private String language;
    private Boolean playVideosOnRandomOrder;
    private Boolean printDuplicate;
    private Boolean printEstWaiting;
    private Boolean printPosition;
    private Boolean queueAssignedUserHasOwnNumberSequence;
    private String queueSmsDupErrMsg;
    private String queueSmsDupErrMsgPart2;
    private String queueSmsHelpMessage;
    private String queueSmsHelpMessagePart2;
    private String queueStatusSmsMessage2;
    private String queueStatusSmsMessage2Part2;
    private String queueStatusSmsMessagePart2;
    private Integer queueStatusSmsMessagePosition;
    private Integer queueStatusSmsMessagePosition2;
    private Boolean serviceHasAppointment;
    private String serviceSurveyJsp;
    private Boolean showCallerEditDataPopup;
    private Boolean showLastQueueCalledOnCaller;
    private Boolean showTransactionTypeReport;
    private String smsServiceType;
    private Integer surveyHoursAgo;
    private String surveySetting;
    private String surveyType;
    private String twilioApiSid;
    private String twilioApiToken;
    private String twilioApiPhoneNumber;
    private Boolean useClickatell;
    private Boolean isTmx80MmPrinter;
    private Boolean canAdministerQueue;
    private Boolean canDisableCallerButtons;
    private Boolean retainTransferPrefix;
    private String viewerAdType;
    private Boolean showSummRepNoLogin;
    private Boolean canReturnQueues;
    private String appointmentCronExpression;
    private Boolean canDirectTransferQueues;
    private String countryCode;
    private Boolean isAppointmentSchedulerEnabled;
    private String appointmentUrl;
    private Integer queueClearHour;
    private Integer queueClearMinute;
    private Integer queueClearPeriod;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "created_on")
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @Basic
    @Column(name = "updated_on")
    public Timestamp getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Basic
    @Column(name = "valid")
    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Basic
    @Column(name = "ad_refresh_interval")
    public Integer getAdRefreshInterval() {
        return adRefreshInterval;
    }

    public void setAdRefreshInterval(Integer adRefreshInterval) {
        this.adRefreshInterval = adRefreshInterval;
    }

    @Basic
    @Column(name = "allow_duplicate_counter_number")
    public Boolean getAllowDuplicateCounterNumber() {
        return allowDuplicateCounterNumber;
    }

    public void setAllowDuplicateCounterNumber(Boolean allowDuplicateCounterNumber) {
        this.allowDuplicateCounterNumber = allowDuplicateCounterNumber;
    }

    @Basic
    @Column(name = "branch_code")
    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    @Basic
    @Column(name = "call_interval")
    public Integer getCallInterval() {
        return callInterval;
    }

    public void setCallInterval(Integer callInterval) {
        this.callInterval = callInterval;
    }

    @Basic
    @Column(name = "call_prefix")
    public String getCallPrefix() {
        return callPrefix;
    }

    public void setCallPrefix(String callPrefix) {
        this.callPrefix = callPrefix;
    }

    @Basic
    @Column(name = "call_section")
    public String getCallSection() {
        return callSection;
    }

    public void setCallSection(String callSection) {
        this.callSection = callSection;
    }

    @Basic
    @Column(name = "call_suffix")
    public String getCallSuffix() {
        return callSuffix;
    }

    public void setCallSuffix(String callSuffix) {
        this.callSuffix = callSuffix;
    }

    @Basic
    @Column(name = "company_folder")
    public String getCompanyFolder() {
        return companyFolder;
    }

    public void setCompanyFolder(String companyFolder) {
        this.companyFolder = companyFolder;
    }

    @Basic
    @Column(name = "company_name")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "date_format")
    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    @Basic
    @Column(name = "display_accouncement")
    public String getDisplayAccouncement() {
        return displayAccouncement;
    }

    public void setDisplayAccouncement(String displayAccouncement) {
        this.displayAccouncement = displayAccouncement;
    }

    @Basic
    @Column(name = "display_jsp")
    public String getDisplayJsp() {
        return displayJsp;
    }

    public void setDisplayJsp(String displayJsp) {
        this.displayJsp = displayJsp;
    }

    @Basic
    @Column(name = "end")
    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Basic
    @Column(name = "exclude_read_counter")
    public Boolean getExcludeReadCounter() {
        return excludeReadCounter;
    }

    public void setExcludeReadCounter(Boolean excludeReadCounter) {
        this.excludeReadCounter = excludeReadCounter;
    }

    @Basic
    @Column(name = "five_button_printer_com_port")
    public String getFiveButtonPrinterComPort() {
        return fiveButtonPrinterComPort;
    }

    public void setFiveButtonPrinterComPort(String fiveButtonPrinterComPort) {
        this.fiveButtonPrinterComPort = fiveButtonPrinterComPort;
    }

    @Basic
    @Column(name = "generate_jsp")
    public String getGenerateJsp() {
        return generateJsp;
    }

    public void setGenerateJsp(String generateJsp) {
        this.generateJsp = generateJsp;
    }

    @Basic
    @Column(name = "generate_queue_sms_message")
    public String getGenerateQueueSmsMessage() {
        return generateQueueSmsMessage;
    }

    public void setGenerateQueueSmsMessage(String generateQueueSmsMessage) {
        this.generateQueueSmsMessage = generateQueueSmsMessage;
    }

    @Basic
    @Column(name = "has_generate_queue_sms")
    public Boolean getHasGenerateQueueSms() {
        return hasGenerateQueueSms;
    }

    public void setHasGenerateQueueSms(Boolean hasGenerateQueueSms) {
        this.hasGenerateQueueSms = hasGenerateQueueSms;
    }

    @Basic
    @Column(name = "has_image_header")
    public Boolean getHasImageHeader() {
        return hasImageHeader;
    }

    public void setHasImageHeader(Boolean hasImageHeader) {
        this.hasImageHeader = hasImageHeader;
    }

    @Basic
    @Column(name = "has_initial_sound")
    public Boolean getHasInitialSound() {
        return hasInitialSound;
    }

    public void setHasInitialSound(Boolean hasInitialSound) {
        this.hasInitialSound = hasInitialSound;
    }

    @Basic
    @Column(name = "has_no_transaction_entries")
    public Boolean getHasNoTransactionEntries() {
        return hasNoTransactionEntries;
    }

    public void setHasNoTransactionEntries(Boolean hasNoTransactionEntries) {
        this.hasNoTransactionEntries = hasNoTransactionEntries;
    }

    @Basic
    @Column(name = "has_post_sound")
    public Boolean getHasPostSound() {
        return hasPostSound;
    }

    public void setHasPostSound(Boolean hasPostSound) {
        this.hasPostSound = hasPostSound;
    }

    @Basic
    @Column(name = "has_queue_status_sms")
    public Boolean getHasQueueStatusSms() {
        return hasQueueStatusSms;
    }

    public void setHasQueueStatusSms(Boolean hasQueueStatusSms) {
        this.hasQueueStatusSms = hasQueueStatusSms;
    }

    @Basic
    @Column(name = "has_senior_patient")
    public Boolean getHasSeniorPatient() {
        return hasSeniorPatient;
    }

    public void setHasSeniorPatient(Boolean hasSeniorPatient) {
        this.hasSeniorPatient = hasSeniorPatient;
    }

    @Basic
    @Column(name = "has_text_header")
    public Boolean getHasTextHeader() {
        return hasTextHeader;
    }

    public void setHasTextHeader(Boolean hasTextHeader) {
        this.hasTextHeader = hasTextHeader;
    }

    @Basic
    @Column(name = "has_transactions")
    public Boolean getHasTransactions() {
        return hasTransactions;
    }

    public void setHasTransactions(Boolean hasTransactions) {
        this.hasTransactions = hasTransactions;
    }

    @Basic
    @Column(name = "hide_the_time")
    public Boolean getHideTheTime() {
        return hideTheTime;
    }

    public void setHideTheTime(Boolean hideTheTime) {
        this.hideTheTime = hideTheTime;
    }

    @Basic
    @Column(name = "image_header_location")
    public String getImageHeaderLocation() {
        return imageHeaderLocation;
    }

    public void setImageHeaderLocation(String imageHeaderLocation) {
        this.imageHeaderLocation = imageHeaderLocation;
    }

    @Basic
    @Column(name = "include_description_on_queue_transaction")
    public Boolean getIncludeDescriptionOnQueueTransaction() {
        return includeDescriptionOnQueueTransaction;
    }

    public void setIncludeDescriptionOnQueueTransaction(Boolean includeDescriptionOnQueueTransaction) {
        this.includeDescriptionOnQueueTransaction = includeDescriptionOnQueueTransaction;
    }

    @Basic
    @Column(name = "include_standby_in_processing")
    public Boolean getIncludeStandbyInProcessing() {
        return includeStandbyInProcessing;
    }

    public void setIncludeStandbyInProcessing(Boolean includeStandbyInProcessing) {
        this.includeStandbyInProcessing = includeStandbyInProcessing;
    }

    @Basic
    @Column(name = "input_queue_notes")
    public Boolean getInputQueueNotes() {
        return inputQueueNotes;
    }

    public void setInputQueueNotes(Boolean inputQueueNotes) {
        this.inputQueueNotes = inputQueueNotes;
    }

    @Basic
    @Column(name = "is_five_button_printer_enabled")
    public Boolean getFiveButtonPrinterEnabled() {
        return isFiveButtonPrinterEnabled;
    }

    public void setFiveButtonPrinterEnabled(Boolean fiveButtonPrinterEnabled) {
        isFiveButtonPrinterEnabled = fiveButtonPrinterEnabled;
    }

    @Basic
    @Column(name = "is_sound_bell")
    public Boolean getSoundBell() {
        return isSoundBell;
    }

    public void setSoundBell(Boolean soundBell) {
        isSoundBell = soundBell;
    }

    @Basic
    @Column(name = "locale_code")
    public String getLocaleCode() {
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }

    @Basic
    @Column(name = "max_now_serving")
    public Integer getMaxNowServing() {
        return maxNowServing;
    }

    public void setMaxNowServing(Integer maxNowServing) {
        this.maxNowServing = maxNowServing;
    }

    @Basic
    @Column(name = "multiple_transaction_title")
    public Boolean getMultipleTransactionTitle() {
        return multipleTransactionTitle;
    }

    public void setMultipleTransactionTitle(Boolean multipleTransactionTitle) {
        this.multipleTransactionTitle = multipleTransactionTitle;
    }

    @Basic
    @Column(name = "no_show_time")
    public Integer getNoShowTime() {
        return noShowTime;
    }

    public void setNoShowTime(Integer noShowTime) {
        this.noShowTime = noShowTime;
    }

    @Basic
    @Column(name = "print_header")
    public String getPrintHeader() {
        return printHeader;
    }

    public void setPrintHeader(String printHeader) {
        this.printHeader = printHeader;
    }

    @Basic
    @Column(name = "queue_status_sms_message")
    public String getQueueStatusSmsMessage() {
        return queueStatusSmsMessage;
    }

    public void setQueueStatusSmsMessage(String queueStatusSmsMessage) {
        this.queueStatusSmsMessage = queueStatusSmsMessage;
    }

    @Basic
    @Column(name = "read_as_whole")
    public Boolean getReadAsWhole() {
        return readAsWhole;
    }

    public void setReadAsWhole(Boolean readAsWhole) {
        this.readAsWhole = readAsWhole;
    }

    @Basic
    @Column(name = "read_counters_as_whole")
    public Boolean getReadCountersAsWhole() {
        return readCountersAsWhole;
    }

    public void setReadCountersAsWhole(Boolean readCountersAsWhole) {
        this.readCountersAsWhole = readCountersAsWhole;
    }

    @Basic
    @Column(name = "reception_title")
    public String getReceptionTitle() {
        return receptionTitle;
    }

    public void setReceptionTitle(String receptionTitle) {
        this.receptionTitle = receptionTitle;
    }

    @Basic
    @Column(name = "recipient_position_for_queue_status_sms")
    public Integer getRecipientPositionForQueueStatusSms() {
        return recipientPositionForQueueStatusSms;
    }

    public void setRecipientPositionForQueueStatusSms(Integer recipientPositionForQueueStatusSms) {
        this.recipientPositionForQueueStatusSms = recipientPositionForQueueStatusSms;
    }

    @Basic
    @Column(name = "recipient_size_of_queue_status_sms")
    public Integer getRecipientSizeOfQueueStatusSms() {
        return recipientSizeOfQueueStatusSms;
    }

    public void setRecipientSizeOfQueueStatusSms(Integer recipientSizeOfQueueStatusSms) {
        this.recipientSizeOfQueueStatusSms = recipientSizeOfQueueStatusSms;
    }

    @Basic
    @Column(name = "repeat_call")
    public Integer getRepeatCall() {
        return repeatCall;
    }

    public void setRepeatCall(Integer repeatCall) {
        this.repeatCall = repeatCall;
    }

    @Basic
    @Column(name = "require_transactions")
    public Boolean getRequireTransactions() {
        return requireTransactions;
    }

    public void setRequireTransactions(Boolean requireTransactions) {
        this.requireTransactions = requireTransactions;
    }

    @Basic
    @Column(name = "show_data_instead_of_number")
    public Boolean getShowDataInsteadOfNumber() {
        return showDataInsteadOfNumber;
    }

    public void setShowDataInsteadOfNumber(Boolean showDataInsteadOfNumber) {
        this.showDataInsteadOfNumber = showDataInsteadOfNumber;
    }

    @Basic
    @Column(name = "show_null_on_queue_transaction")
    public Boolean getShowNullOnQueueTransaction() {
        return showNullOnQueueTransaction;
    }

    public void setShowNullOnQueueTransaction(Boolean showNullOnQueueTransaction) {
        this.showNullOnQueueTransaction = showNullOnQueueTransaction;
    }

    @Basic
    @Column(name = "sms_com_port")
    public String getSmsComPort() {
        return smsComPort;
    }

    public void setSmsComPort(String smsComPort) {
        this.smsComPort = smsComPort;
    }

    @Basic
    @Column(name = "sms_message_center_number")
    public String getSmsMessageCenterNumber() {
        return smsMessageCenterNumber;
    }

    public void setSmsMessageCenterNumber(String smsMessageCenterNumber) {
        this.smsMessageCenterNumber = smsMessageCenterNumber;
    }

    @Basic
    @Column(name = "sms_number")
    public String getSmsNumber() {
        return smsNumber;
    }

    public void setSmsNumber(String smsNumber) {
        this.smsNumber = smsNumber;
    }

    @Basic
    @Column(name = "start")
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    @Basic
    @Column(name = "tabular_data")
    public String getTabularData() {
        return tabularData;
    }

    public void setTabularData(String tabularData) {
        this.tabularData = tabularData;
    }

    @Basic
    @Column(name = "teller_identification_type")
    public String getTellerIdentificationType() {
        return tellerIdentificationType;
    }

    public void setTellerIdentificationType(String tellerIdentificationType) {
        this.tellerIdentificationType = tellerIdentificationType;
    }

    @Basic
    @Column(name = "transaction_map_to_service")
    public Boolean getTransactionMapToService() {
        return transactionMapToService;
    }

    public void setTransactionMapToService(Boolean transactionMapToService) {
        this.transactionMapToService = transactionMapToService;
    }

    @Basic
    @Column(name = "transfer_by_section")
    public Boolean getTransferBySection() {
        return transferBySection;
    }

    public void setTransferBySection(Boolean transferBySection) {
        this.transferBySection = transferBySection;
    }

    @Basic
    @Column(name = "tv_stream_broadcast_address")
    public String getTvStreamBroadcastAddress() {
        return tvStreamBroadcastAddress;
    }

    public void setTvStreamBroadcastAddress(String tvStreamBroadcastAddress) {
        this.tvStreamBroadcastAddress = tvStreamBroadcastAddress;
    }

    @Basic
    @Column(name = "tv_stream_port")
    public String getTvStreamPort() {
        return tvStreamPort;
    }

    public void setTvStreamPort(String tvStreamPort) {
        this.tvStreamPort = tvStreamPort;
    }

    @Basic
    @Column(name = "tv_stream_source_address")
    public String getTvStreamSourceAddress() {
        return tvStreamSourceAddress;
    }

    public void setTvStreamSourceAddress(String tvStreamSourceAddress) {
        this.tvStreamSourceAddress = tvStreamSourceAddress;
    }

    @Basic
    @Column(name = "web_service_ip")
    public String getWebServiceIp() {
        return webServiceIp;
    }

    public void setWebServiceIp(String webServiceIp) {
        this.webServiceIp = webServiceIp;
    }

    @Basic
    @Column(name = "botswana_web_sms_password")
    public String getBotswanaWebSmsPassword() {
        return botswanaWebSmsPassword;
    }

    public void setBotswanaWebSmsPassword(String botswanaWebSmsPassword) {
        this.botswanaWebSmsPassword = botswanaWebSmsPassword;
    }

    @Basic
    @Column(name = "botswana_web_sms_username")
    public String getBotswanaWebSmsUsername() {
        return botswanaWebSmsUsername;
    }

    public void setBotswanaWebSmsUsername(String botswanaWebSmsUsername) {
        this.botswanaWebSmsUsername = botswanaWebSmsUsername;
    }

    @Basic
    @Column(name = "can_download_data_report")
    public Boolean getCanDownloadDataReport() {
        return canDownloadDataReport;
    }

    public void setCanDownloadDataReport(Boolean canDownloadDataReport) {
        this.canDownloadDataReport = canDownloadDataReport;
    }

    @Basic
    @Column(name = "can_download_queue_list_on_caller")
    public Boolean getCanDownloadQueueListOnCaller() {
        return canDownloadQueueListOnCaller;
    }

    public void setCanDownloadQueueListOnCaller(Boolean canDownloadQueueListOnCaller) {
        this.canDownloadQueueListOnCaller = canDownloadQueueListOnCaller;
    }

    @Basic
    @Column(name = "can_group_services")
    public Boolean getCanGroupServices() {
        return canGroupServices;
    }

    public void setCanGroupServices(Boolean canGroupServices) {
        this.canGroupServices = canGroupServices;
    }

    @Basic
    @Column(name = "can_multi_login_caller")
    public Boolean getCanMultiLoginCaller() {
        return canMultiLoginCaller;
    }

    public void setCanMultiLoginCaller(Boolean canMultiLoginCaller) {
        this.canMultiLoginCaller = canMultiLoginCaller;
    }

    @Basic
    @Column(name = "can_queue_from_sms")
    public Boolean getCanQueueFromSms() {
        return canQueueFromSms;
    }

    public void setCanQueueFromSms(Boolean canQueueFromSms) {
        this.canQueueFromSms = canQueueFromSms;
    }

    @Basic
    @Column(name = "clickatell_apikey")
    public String getClickatellApikey() {
        return clickatellApikey;
    }

    public void setClickatellApikey(String clickatellApikey) {
        this.clickatellApikey = clickatellApikey;
    }

    @Basic
    @Column(name = "contact_number")
    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Basic
    @Column(name = "create_video_list_from_video_folder_files")
    public Boolean getCreateVideoListFromVideoFolderFiles() {
        return createVideoListFromVideoFolderFiles;
    }

    public void setCreateVideoListFromVideoFolderFiles(Boolean createVideoListFromVideoFolderFiles) {
        this.createVideoListFromVideoFolderFiles = createVideoListFromVideoFolderFiles;
    }

    @Basic
    @Column(name = "disable_caller_edit_name")
    public Boolean getDisableCallerEditName() {
        return disableCallerEditName;
    }

    public void setDisableCallerEditName(Boolean disableCallerEditName) {
        this.disableCallerEditName = disableCallerEditName;
    }

    @Basic
    @Column(name = "disabled_caller_alert_message")
    public Boolean getDisabledCallerAlertMessage() {
        return disabledCallerAlertMessage;
    }

    public void setDisabledCallerAlertMessage(Boolean disabledCallerAlertMessage) {
        this.disabledCallerAlertMessage = disabledCallerAlertMessage;
    }

    @Basic
    @Column(name = "enable_ldap")
    public Boolean getEnableLdap() {
        return enableLdap;
    }

    public void setEnableLdap(Boolean enableLdap) {
        this.enableLdap = enableLdap;
    }

    @Basic
    @Column(name = "generate_queue_on_call")
    public Boolean getGenerateQueueOnCall() {
        return generateQueueOnCall;
    }

    public void setGenerateQueueOnCall(Boolean generateQueueOnCall) {
        this.generateQueueOnCall = generateQueueOnCall;
    }

    @Basic
    @Column(name = "generate_queue_sms_message_part_2")
    public String getGenerateQueueSmsMessagePart2() {
        return generateQueueSmsMessagePart2;
    }

    public void setGenerateQueueSmsMessagePart2(String generateQueueSmsMessagePart2) {
        this.generateQueueSmsMessagePart2 = generateQueueSmsMessagePart2;
    }

    @Basic
    @Column(name = "has_break_function")
    public Boolean getHasBreakFunction() {
        return hasBreakFunction;
    }

    public void setHasBreakFunction(Boolean hasBreakFunction) {
        this.hasBreakFunction = hasBreakFunction;
    }

    @Basic
    @Column(name = "has_ongoing_queue_sms")
    public Boolean getHasOngoingQueueSms() {
        return hasOngoingQueueSms;
    }

    public void setHasOngoingQueueSms(Boolean hasOngoingQueueSms) {
        this.hasOngoingQueueSms = hasOngoingQueueSms;
    }

    @Basic
    @Column(name = "has_ongoing_queue_sms_2")
    public Boolean getHasOngoingQueueSms2() {
        return hasOngoingQueueSms2;
    }

    public void setHasOngoingQueueSms2(Boolean hasOngoingQueueSms2) {
        this.hasOngoingQueueSms2 = hasOngoingQueueSms2;
    }

    @Basic
    @Column(name = "hide_settings_on_caller")
    public Boolean getHideSettingsOnCaller() {
        return hideSettingsOnCaller;
    }

    public void setHideSettingsOnCaller(Boolean hideSettingsOnCaller) {
        this.hideSettingsOnCaller = hideSettingsOnCaller;
    }

    @Basic
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "play_videos_on_random_order")
    public Boolean getPlayVideosOnRandomOrder() {
        return playVideosOnRandomOrder;
    }

    public void setPlayVideosOnRandomOrder(Boolean playVideosOnRandomOrder) {
        this.playVideosOnRandomOrder = playVideosOnRandomOrder;
    }

    @Basic
    @Column(name = "print_duplicate")
    public Boolean getPrintDuplicate() {
        return printDuplicate;
    }

    public void setPrintDuplicate(Boolean printDuplicate) {
        this.printDuplicate = printDuplicate;
    }

    @Basic
    @Column(name = "print_est_waiting")
    public Boolean getPrintEstWaiting() {
        return printEstWaiting;
    }

    public void setPrintEstWaiting(Boolean printEstWaiting) {
        this.printEstWaiting = printEstWaiting;
    }

    @Basic
    @Column(name = "print_position")
    public Boolean getPrintPosition() {
        return printPosition;
    }

    public void setPrintPosition(Boolean printPosition) {
        this.printPosition = printPosition;
    }

    @Basic
    @Column(name = "queue_assigned_user_has_own_number_sequence")
    public Boolean getQueueAssignedUserHasOwnNumberSequence() {
        return queueAssignedUserHasOwnNumberSequence;
    }

    public void setQueueAssignedUserHasOwnNumberSequence(Boolean queueAssignedUserHasOwnNumberSequence) {
        this.queueAssignedUserHasOwnNumberSequence = queueAssignedUserHasOwnNumberSequence;
    }

    @Basic
    @Column(name = "queue_sms_dup_err_msg")
    public String getQueueSmsDupErrMsg() {
        return queueSmsDupErrMsg;
    }

    public void setQueueSmsDupErrMsg(String queueSmsDupErrMsg) {
        this.queueSmsDupErrMsg = queueSmsDupErrMsg;
    }

    @Basic
    @Column(name = "queue_sms_dup_err_msg_part_2")
    public String getQueueSmsDupErrMsgPart2() {
        return queueSmsDupErrMsgPart2;
    }

    public void setQueueSmsDupErrMsgPart2(String queueSmsDupErrMsgPart2) {
        this.queueSmsDupErrMsgPart2 = queueSmsDupErrMsgPart2;
    }

    @Basic
    @Column(name = "queue_sms_help_message")
    public String getQueueSmsHelpMessage() {
        return queueSmsHelpMessage;
    }

    public void setQueueSmsHelpMessage(String queueSmsHelpMessage) {
        this.queueSmsHelpMessage = queueSmsHelpMessage;
    }

    @Basic
    @Column(name = "queue_sms_help_message_part_2")
    public String getQueueSmsHelpMessagePart2() {
        return queueSmsHelpMessagePart2;
    }

    public void setQueueSmsHelpMessagePart2(String queueSmsHelpMessagePart2) {
        this.queueSmsHelpMessagePart2 = queueSmsHelpMessagePart2;
    }

    @Basic
    @Column(name = "queue_status_sms_message_2")
    public String getQueueStatusSmsMessage2() {
        return queueStatusSmsMessage2;
    }

    public void setQueueStatusSmsMessage2(String queueStatusSmsMessage2) {
        this.queueStatusSmsMessage2 = queueStatusSmsMessage2;
    }

    @Basic
    @Column(name = "queue_status_sms_message_2_part_2")
    public String getQueueStatusSmsMessage2Part2() {
        return queueStatusSmsMessage2Part2;
    }

    public void setQueueStatusSmsMessage2Part2(String queueStatusSmsMessage2Part2) {
        this.queueStatusSmsMessage2Part2 = queueStatusSmsMessage2Part2;
    }

    @Basic
    @Column(name = "queue_status_sms_message_part_2")
    public String getQueueStatusSmsMessagePart2() {
        return queueStatusSmsMessagePart2;
    }

    public void setQueueStatusSmsMessagePart2(String queueStatusSmsMessagePart2) {
        this.queueStatusSmsMessagePart2 = queueStatusSmsMessagePart2;
    }

    @Basic
    @Column(name = "queue_status_sms_message_position")
    public Integer getQueueStatusSmsMessagePosition() {
        return queueStatusSmsMessagePosition;
    }

    public void setQueueStatusSmsMessagePosition(Integer queueStatusSmsMessagePosition) {
        this.queueStatusSmsMessagePosition = queueStatusSmsMessagePosition;
    }

    @Basic
    @Column(name = "queue_status_sms_message_position_2")
    public Integer getQueueStatusSmsMessagePosition2() {
        return queueStatusSmsMessagePosition2;
    }

    public void setQueueStatusSmsMessagePosition2(Integer queueStatusSmsMessagePosition2) {
        this.queueStatusSmsMessagePosition2 = queueStatusSmsMessagePosition2;
    }

    @Basic
    @Column(name = "service_has_appointment")
    public Boolean getServiceHasAppointment() {
        return serviceHasAppointment;
    }

    public void setServiceHasAppointment(Boolean serviceHasAppointment) {
        this.serviceHasAppointment = serviceHasAppointment;
    }

    @Basic
    @Column(name = "service_survey_jsp")
    public String getServiceSurveyJsp() {
        return serviceSurveyJsp;
    }

    public void setServiceSurveyJsp(String serviceSurveyJsp) {
        this.serviceSurveyJsp = serviceSurveyJsp;
    }

    @Basic
    @Column(name = "show_caller_edit_data_popup")
    public Boolean getShowCallerEditDataPopup() {
        return showCallerEditDataPopup;
    }

    public void setShowCallerEditDataPopup(Boolean showCallerEditDataPopup) {
        this.showCallerEditDataPopup = showCallerEditDataPopup;
    }

    @Basic
    @Column(name = "show_last_queue_called_on_caller")
    public Boolean getShowLastQueueCalledOnCaller() {
        return showLastQueueCalledOnCaller;
    }

    public void setShowLastQueueCalledOnCaller(Boolean showLastQueueCalledOnCaller) {
        this.showLastQueueCalledOnCaller = showLastQueueCalledOnCaller;
    }

    @Basic
    @Column(name = "show_transaction_type_report")
    public Boolean getShowTransactionTypeReport() {
        return showTransactionTypeReport;
    }

    public void setShowTransactionTypeReport(Boolean showTransactionTypeReport) {
        this.showTransactionTypeReport = showTransactionTypeReport;
    }

    @Basic
    @Column(name = "sms_service_type")
    public String getSmsServiceType() {
        return smsServiceType;
    }

    public void setSmsServiceType(String smsServiceType) {
        this.smsServiceType = smsServiceType;
    }

    @Basic
    @Column(name = "survey_hours_ago")
    public Integer getSurveyHoursAgo() {
        return surveyHoursAgo;
    }

    public void setSurveyHoursAgo(Integer surveyHoursAgo) {
        this.surveyHoursAgo = surveyHoursAgo;
    }

    @Basic
    @Column(name = "survey_setting")
    public String getSurveySetting() {
        return surveySetting;
    }

    public void setSurveySetting(String surveySetting) {
        this.surveySetting = surveySetting;
    }

    @Basic
    @Column(name = "survey_type")
    public String getSurveyType() {
        return surveyType;
    }

    public void setSurveyType(String surveyType) {
        this.surveyType = surveyType;
    }

    @Basic
    @Column(name = "twilio_api_sid")
    public String getTwilioApiSid() {
        return twilioApiSid;
    }

    public void setTwilioApiSid(String twilioApiSid) {
        this.twilioApiSid = twilioApiSid;
    }

    @Basic
    @Column(name = "twilio_api_token")
    public String getTwilioApiToken() {
        return twilioApiToken;
    }

    public void setTwilioApiToken(String twilioApiToken) {
        this.twilioApiToken = twilioApiToken;
    }

    @Basic
    @Column(name = "twilio_api_phone_number")
    public String getTwilioApiPhoneNumber() {
        return twilioApiPhoneNumber;
    }

    public void setTwilioApiPhoneNumber(String twilioApiPhoneNumber) {
        this.twilioApiPhoneNumber = twilioApiPhoneNumber;
    }

    @Basic
    @Column(name = "use_clickatell")
    public Boolean getUseClickatell() {
        return useClickatell;
    }

    public void setUseClickatell(Boolean useClickatell) {
        this.useClickatell = useClickatell;
    }

    @Basic
    @Column(name = "is_tmx80mm_printer")
    public Boolean getTmx80MmPrinter() {
        return isTmx80MmPrinter;
    }

    public void setTmx80MmPrinter(Boolean tmx80MmPrinter) {
        isTmx80MmPrinter = tmx80MmPrinter;
    }

    @Basic
    @Column(name = "can_administer_queue")
    public Boolean getCanAdministerQueue() {
        return canAdministerQueue;
    }

    public void setCanAdministerQueue(Boolean canAdministerQueue) {
        this.canAdministerQueue = canAdministerQueue;
    }

    @Basic
    @Column(name = "can_disable_caller_buttons")
    public Boolean getCanDisableCallerButtons() {
        return canDisableCallerButtons;
    }

    public void setCanDisableCallerButtons(Boolean canDisableCallerButtons) {
        this.canDisableCallerButtons = canDisableCallerButtons;
    }

    @Basic
    @Column(name = "retain_transfer_prefix")
    public Boolean getRetainTransferPrefix() {
        return retainTransferPrefix;
    }

    public void setRetainTransferPrefix(Boolean retainTransferPrefix) {
        this.retainTransferPrefix = retainTransferPrefix;
    }

    @Basic
    @Column(name = "viewer_ad_type")
    public String getViewerAdType() {
        return viewerAdType;
    }

    public void setViewerAdType(String viewerAdType) {
        this.viewerAdType = viewerAdType;
    }

    @Basic
    @Column(name = "show_summ_rep_no_login")
    public Boolean getShowSummRepNoLogin() {
        return showSummRepNoLogin;
    }

    public void setShowSummRepNoLogin(Boolean showSummRepNoLogin) {
        this.showSummRepNoLogin = showSummRepNoLogin;
    }

    @Basic
    @Column(name = "can_return_queues")
    public Boolean getCanReturnQueues() {
        return canReturnQueues;
    }

    public void setCanReturnQueues(Boolean canReturnQueues) {
        this.canReturnQueues = canReturnQueues;
    }

    @Basic
    @Column(name = "appointment_cron_expression")
    public String getAppointmentCronExpression() {
        return appointmentCronExpression;
    }

    public void setAppointmentCronExpression(String appointmentCronExpression) {
        this.appointmentCronExpression = appointmentCronExpression;
    }

    @Basic
    @Column(name = "can_direct_transfer_queues")
    public Boolean getCanDirectTransferQueues() {
        return canDirectTransferQueues;
    }

    public void setCanDirectTransferQueues(Boolean canDirectTransferQueues) {
        this.canDirectTransferQueues = canDirectTransferQueues;
    }

    @Basic
    @Column(name = "country_code")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Basic
    @Column(name = "is_appointment_scheduler_enabled")
    public Boolean getAppointmentSchedulerEnabled() {
        return isAppointmentSchedulerEnabled;
    }

    public void setAppointmentSchedulerEnabled(Boolean appointmentSchedulerEnabled) {
        isAppointmentSchedulerEnabled = appointmentSchedulerEnabled;
    }

    @Basic
    @Column(name = "appointment_url")
    public String getAppointmentUrl() {
        return appointmentUrl;
    }

    public void setAppointmentUrl(String appointmentUrl) {
        this.appointmentUrl = appointmentUrl;
    }

    @Basic
    @Column(name = "queue_clear_hour")
    public Integer getQueueClearHour() {
        return queueClearHour;
    }

    public void setQueueClearHour(Integer queueClearHour) {
        this.queueClearHour = queueClearHour;
    }

    @Basic
    @Column(name = "queue_clear_minute")
    public Integer getQueueClearMinute() {
        return queueClearMinute;
    }

    public void setQueueClearMinute(Integer queueClearMinute) {
        this.queueClearMinute = queueClearMinute;
    }

    @Basic
    @Column(name = "queue_clear_period")
    public Integer getQueueClearPeriod() {
        return queueClearPeriod;
    }

    public void setQueueClearPeriod(Integer queueClearPeriod) {
        this.queueClearPeriod = queueClearPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Configuration that = (Configuration) o;

        if (id != that.id) return false;
        if (valid != that.valid) return false;
        if (createdOn != null ? !createdOn.equals(that.createdOn) : that.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(that.updatedOn) : that.updatedOn != null) return false;
        if (adRefreshInterval != null ? !adRefreshInterval.equals(that.adRefreshInterval) : that.adRefreshInterval != null)
            return false;
        if (allowDuplicateCounterNumber != null ? !allowDuplicateCounterNumber.equals(that.allowDuplicateCounterNumber) : that.allowDuplicateCounterNumber != null)
            return false;
        if (branchCode != null ? !branchCode.equals(that.branchCode) : that.branchCode != null) return false;
        if (callInterval != null ? !callInterval.equals(that.callInterval) : that.callInterval != null) return false;
        if (callPrefix != null ? !callPrefix.equals(that.callPrefix) : that.callPrefix != null) return false;
        if (callSection != null ? !callSection.equals(that.callSection) : that.callSection != null) return false;
        if (callSuffix != null ? !callSuffix.equals(that.callSuffix) : that.callSuffix != null) return false;
        if (companyFolder != null ? !companyFolder.equals(that.companyFolder) : that.companyFolder != null)
            return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (dateFormat != null ? !dateFormat.equals(that.dateFormat) : that.dateFormat != null) return false;
        if (displayAccouncement != null ? !displayAccouncement.equals(that.displayAccouncement) : that.displayAccouncement != null)
            return false;
        if (displayJsp != null ? !displayJsp.equals(that.displayJsp) : that.displayJsp != null) return false;
        if (end != null ? !end.equals(that.end) : that.end != null) return false;
        if (excludeReadCounter != null ? !excludeReadCounter.equals(that.excludeReadCounter) : that.excludeReadCounter != null)
            return false;
        if (fiveButtonPrinterComPort != null ? !fiveButtonPrinterComPort.equals(that.fiveButtonPrinterComPort) : that.fiveButtonPrinterComPort != null)
            return false;
        if (generateJsp != null ? !generateJsp.equals(that.generateJsp) : that.generateJsp != null) return false;
        if (generateQueueSmsMessage != null ? !generateQueueSmsMessage.equals(that.generateQueueSmsMessage) : that.generateQueueSmsMessage != null)
            return false;
        if (hasGenerateQueueSms != null ? !hasGenerateQueueSms.equals(that.hasGenerateQueueSms) : that.hasGenerateQueueSms != null)
            return false;
        if (hasImageHeader != null ? !hasImageHeader.equals(that.hasImageHeader) : that.hasImageHeader != null)
            return false;
        if (hasInitialSound != null ? !hasInitialSound.equals(that.hasInitialSound) : that.hasInitialSound != null)
            return false;
        if (hasNoTransactionEntries != null ? !hasNoTransactionEntries.equals(that.hasNoTransactionEntries) : that.hasNoTransactionEntries != null)
            return false;
        if (hasPostSound != null ? !hasPostSound.equals(that.hasPostSound) : that.hasPostSound != null) return false;
        if (hasQueueStatusSms != null ? !hasQueueStatusSms.equals(that.hasQueueStatusSms) : that.hasQueueStatusSms != null)
            return false;
        if (hasSeniorPatient != null ? !hasSeniorPatient.equals(that.hasSeniorPatient) : that.hasSeniorPatient != null)
            return false;
        if (hasTextHeader != null ? !hasTextHeader.equals(that.hasTextHeader) : that.hasTextHeader != null)
            return false;
        if (hasTransactions != null ? !hasTransactions.equals(that.hasTransactions) : that.hasTransactions != null)
            return false;
        if (hideTheTime != null ? !hideTheTime.equals(that.hideTheTime) : that.hideTheTime != null) return false;
        if (imageHeaderLocation != null ? !imageHeaderLocation.equals(that.imageHeaderLocation) : that.imageHeaderLocation != null)
            return false;
        if (includeDescriptionOnQueueTransaction != null ? !includeDescriptionOnQueueTransaction.equals(that.includeDescriptionOnQueueTransaction) : that.includeDescriptionOnQueueTransaction != null)
            return false;
        if (includeStandbyInProcessing != null ? !includeStandbyInProcessing.equals(that.includeStandbyInProcessing) : that.includeStandbyInProcessing != null)
            return false;
        if (inputQueueNotes != null ? !inputQueueNotes.equals(that.inputQueueNotes) : that.inputQueueNotes != null)
            return false;
        if (isFiveButtonPrinterEnabled != null ? !isFiveButtonPrinterEnabled.equals(that.isFiveButtonPrinterEnabled) : that.isFiveButtonPrinterEnabled != null)
            return false;
        if (isSoundBell != null ? !isSoundBell.equals(that.isSoundBell) : that.isSoundBell != null) return false;
        if (localeCode != null ? !localeCode.equals(that.localeCode) : that.localeCode != null) return false;
        if (maxNowServing != null ? !maxNowServing.equals(that.maxNowServing) : that.maxNowServing != null)
            return false;
        if (multipleTransactionTitle != null ? !multipleTransactionTitle.equals(that.multipleTransactionTitle) : that.multipleTransactionTitle != null)
            return false;
        if (noShowTime != null ? !noShowTime.equals(that.noShowTime) : that.noShowTime != null) return false;
        if (printHeader != null ? !printHeader.equals(that.printHeader) : that.printHeader != null) return false;
        if (queueStatusSmsMessage != null ? !queueStatusSmsMessage.equals(that.queueStatusSmsMessage) : that.queueStatusSmsMessage != null)
            return false;
        if (readAsWhole != null ? !readAsWhole.equals(that.readAsWhole) : that.readAsWhole != null) return false;
        if (readCountersAsWhole != null ? !readCountersAsWhole.equals(that.readCountersAsWhole) : that.readCountersAsWhole != null)
            return false;
        if (receptionTitle != null ? !receptionTitle.equals(that.receptionTitle) : that.receptionTitle != null)
            return false;
        if (recipientPositionForQueueStatusSms != null ? !recipientPositionForQueueStatusSms.equals(that.recipientPositionForQueueStatusSms) : that.recipientPositionForQueueStatusSms != null)
            return false;
        if (recipientSizeOfQueueStatusSms != null ? !recipientSizeOfQueueStatusSms.equals(that.recipientSizeOfQueueStatusSms) : that.recipientSizeOfQueueStatusSms != null)
            return false;
        if (repeatCall != null ? !repeatCall.equals(that.repeatCall) : that.repeatCall != null) return false;
        if (requireTransactions != null ? !requireTransactions.equals(that.requireTransactions) : that.requireTransactions != null)
            return false;
        if (showDataInsteadOfNumber != null ? !showDataInsteadOfNumber.equals(that.showDataInsteadOfNumber) : that.showDataInsteadOfNumber != null)
            return false;
        if (showNullOnQueueTransaction != null ? !showNullOnQueueTransaction.equals(that.showNullOnQueueTransaction) : that.showNullOnQueueTransaction != null)
            return false;
        if (smsComPort != null ? !smsComPort.equals(that.smsComPort) : that.smsComPort != null) return false;
        if (smsMessageCenterNumber != null ? !smsMessageCenterNumber.equals(that.smsMessageCenterNumber) : that.smsMessageCenterNumber != null)
            return false;
        if (smsNumber != null ? !smsNumber.equals(that.smsNumber) : that.smsNumber != null) return false;
        if (start != null ? !start.equals(that.start) : that.start != null) return false;
        if (tabularData != null ? !tabularData.equals(that.tabularData) : that.tabularData != null) return false;
        if (tellerIdentificationType != null ? !tellerIdentificationType.equals(that.tellerIdentificationType) : that.tellerIdentificationType != null)
            return false;
        if (transactionMapToService != null ? !transactionMapToService.equals(that.transactionMapToService) : that.transactionMapToService != null)
            return false;
        if (transferBySection != null ? !transferBySection.equals(that.transferBySection) : that.transferBySection != null)
            return false;
        if (tvStreamBroadcastAddress != null ? !tvStreamBroadcastAddress.equals(that.tvStreamBroadcastAddress) : that.tvStreamBroadcastAddress != null)
            return false;
        if (tvStreamPort != null ? !tvStreamPort.equals(that.tvStreamPort) : that.tvStreamPort != null) return false;
        if (tvStreamSourceAddress != null ? !tvStreamSourceAddress.equals(that.tvStreamSourceAddress) : that.tvStreamSourceAddress != null)
            return false;
        if (webServiceIp != null ? !webServiceIp.equals(that.webServiceIp) : that.webServiceIp != null) return false;
        if (botswanaWebSmsPassword != null ? !botswanaWebSmsPassword.equals(that.botswanaWebSmsPassword) : that.botswanaWebSmsPassword != null)
            return false;
        if (botswanaWebSmsUsername != null ? !botswanaWebSmsUsername.equals(that.botswanaWebSmsUsername) : that.botswanaWebSmsUsername != null)
            return false;
        if (canDownloadDataReport != null ? !canDownloadDataReport.equals(that.canDownloadDataReport) : that.canDownloadDataReport != null)
            return false;
        if (canDownloadQueueListOnCaller != null ? !canDownloadQueueListOnCaller.equals(that.canDownloadQueueListOnCaller) : that.canDownloadQueueListOnCaller != null)
            return false;
        if (canGroupServices != null ? !canGroupServices.equals(that.canGroupServices) : that.canGroupServices != null)
            return false;
        if (canMultiLoginCaller != null ? !canMultiLoginCaller.equals(that.canMultiLoginCaller) : that.canMultiLoginCaller != null)
            return false;
        if (canQueueFromSms != null ? !canQueueFromSms.equals(that.canQueueFromSms) : that.canQueueFromSms != null)
            return false;
        if (clickatellApikey != null ? !clickatellApikey.equals(that.clickatellApikey) : that.clickatellApikey != null)
            return false;
        if (contactNumber != null ? !contactNumber.equals(that.contactNumber) : that.contactNumber != null)
            return false;
        if (createVideoListFromVideoFolderFiles != null ? !createVideoListFromVideoFolderFiles.equals(that.createVideoListFromVideoFolderFiles) : that.createVideoListFromVideoFolderFiles != null)
            return false;
        if (disableCallerEditName != null ? !disableCallerEditName.equals(that.disableCallerEditName) : that.disableCallerEditName != null)
            return false;
        if (disabledCallerAlertMessage != null ? !disabledCallerAlertMessage.equals(that.disabledCallerAlertMessage) : that.disabledCallerAlertMessage != null)
            return false;
        if (enableLdap != null ? !enableLdap.equals(that.enableLdap) : that.enableLdap != null) return false;
        if (generateQueueOnCall != null ? !generateQueueOnCall.equals(that.generateQueueOnCall) : that.generateQueueOnCall != null)
            return false;
        if (generateQueueSmsMessagePart2 != null ? !generateQueueSmsMessagePart2.equals(that.generateQueueSmsMessagePart2) : that.generateQueueSmsMessagePart2 != null)
            return false;
        if (hasBreakFunction != null ? !hasBreakFunction.equals(that.hasBreakFunction) : that.hasBreakFunction != null)
            return false;
        if (hasOngoingQueueSms != null ? !hasOngoingQueueSms.equals(that.hasOngoingQueueSms) : that.hasOngoingQueueSms != null)
            return false;
        if (hasOngoingQueueSms2 != null ? !hasOngoingQueueSms2.equals(that.hasOngoingQueueSms2) : that.hasOngoingQueueSms2 != null)
            return false;
        if (hideSettingsOnCaller != null ? !hideSettingsOnCaller.equals(that.hideSettingsOnCaller) : that.hideSettingsOnCaller != null)
            return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (playVideosOnRandomOrder != null ? !playVideosOnRandomOrder.equals(that.playVideosOnRandomOrder) : that.playVideosOnRandomOrder != null)
            return false;
        if (printDuplicate != null ? !printDuplicate.equals(that.printDuplicate) : that.printDuplicate != null)
            return false;
        if (printEstWaiting != null ? !printEstWaiting.equals(that.printEstWaiting) : that.printEstWaiting != null)
            return false;
        if (printPosition != null ? !printPosition.equals(that.printPosition) : that.printPosition != null)
            return false;
        if (queueAssignedUserHasOwnNumberSequence != null ? !queueAssignedUserHasOwnNumberSequence.equals(that.queueAssignedUserHasOwnNumberSequence) : that.queueAssignedUserHasOwnNumberSequence != null)
            return false;
        if (queueSmsDupErrMsg != null ? !queueSmsDupErrMsg.equals(that.queueSmsDupErrMsg) : that.queueSmsDupErrMsg != null)
            return false;
        if (queueSmsDupErrMsgPart2 != null ? !queueSmsDupErrMsgPart2.equals(that.queueSmsDupErrMsgPart2) : that.queueSmsDupErrMsgPart2 != null)
            return false;
        if (queueSmsHelpMessage != null ? !queueSmsHelpMessage.equals(that.queueSmsHelpMessage) : that.queueSmsHelpMessage != null)
            return false;
        if (queueSmsHelpMessagePart2 != null ? !queueSmsHelpMessagePart2.equals(that.queueSmsHelpMessagePart2) : that.queueSmsHelpMessagePart2 != null)
            return false;
        if (queueStatusSmsMessage2 != null ? !queueStatusSmsMessage2.equals(that.queueStatusSmsMessage2) : that.queueStatusSmsMessage2 != null)
            return false;
        if (queueStatusSmsMessage2Part2 != null ? !queueStatusSmsMessage2Part2.equals(that.queueStatusSmsMessage2Part2) : that.queueStatusSmsMessage2Part2 != null)
            return false;
        if (queueStatusSmsMessagePart2 != null ? !queueStatusSmsMessagePart2.equals(that.queueStatusSmsMessagePart2) : that.queueStatusSmsMessagePart2 != null)
            return false;
        if (queueStatusSmsMessagePosition != null ? !queueStatusSmsMessagePosition.equals(that.queueStatusSmsMessagePosition) : that.queueStatusSmsMessagePosition != null)
            return false;
        if (queueStatusSmsMessagePosition2 != null ? !queueStatusSmsMessagePosition2.equals(that.queueStatusSmsMessagePosition2) : that.queueStatusSmsMessagePosition2 != null)
            return false;
        if (serviceHasAppointment != null ? !serviceHasAppointment.equals(that.serviceHasAppointment) : that.serviceHasAppointment != null)
            return false;
        if (serviceSurveyJsp != null ? !serviceSurveyJsp.equals(that.serviceSurveyJsp) : that.serviceSurveyJsp != null)
            return false;
        if (showCallerEditDataPopup != null ? !showCallerEditDataPopup.equals(that.showCallerEditDataPopup) : that.showCallerEditDataPopup != null)
            return false;
        if (showLastQueueCalledOnCaller != null ? !showLastQueueCalledOnCaller.equals(that.showLastQueueCalledOnCaller) : that.showLastQueueCalledOnCaller != null)
            return false;
        if (showTransactionTypeReport != null ? !showTransactionTypeReport.equals(that.showTransactionTypeReport) : that.showTransactionTypeReport != null)
            return false;
        if (smsServiceType != null ? !smsServiceType.equals(that.smsServiceType) : that.smsServiceType != null)
            return false;
        if (surveyHoursAgo != null ? !surveyHoursAgo.equals(that.surveyHoursAgo) : that.surveyHoursAgo != null)
            return false;
        if (surveySetting != null ? !surveySetting.equals(that.surveySetting) : that.surveySetting != null)
            return false;
        if (surveyType != null ? !surveyType.equals(that.surveyType) : that.surveyType != null) return false;
        if (twilioApiSid != null ? !twilioApiSid.equals(that.twilioApiSid) : that.twilioApiSid != null) return false;
        if (twilioApiToken != null ? !twilioApiToken.equals(that.twilioApiToken) : that.twilioApiToken != null)
            return false;
        if (twilioApiPhoneNumber != null ? !twilioApiPhoneNumber.equals(that.twilioApiPhoneNumber) : that.twilioApiPhoneNumber != null)
            return false;
        if (useClickatell != null ? !useClickatell.equals(that.useClickatell) : that.useClickatell != null)
            return false;
        if (isTmx80MmPrinter != null ? !isTmx80MmPrinter.equals(that.isTmx80MmPrinter) : that.isTmx80MmPrinter != null)
            return false;
        if (canAdministerQueue != null ? !canAdministerQueue.equals(that.canAdministerQueue) : that.canAdministerQueue != null)
            return false;
        if (canDisableCallerButtons != null ? !canDisableCallerButtons.equals(that.canDisableCallerButtons) : that.canDisableCallerButtons != null)
            return false;
        if (retainTransferPrefix != null ? !retainTransferPrefix.equals(that.retainTransferPrefix) : that.retainTransferPrefix != null)
            return false;
        if (viewerAdType != null ? !viewerAdType.equals(that.viewerAdType) : that.viewerAdType != null) return false;
        if (showSummRepNoLogin != null ? !showSummRepNoLogin.equals(that.showSummRepNoLogin) : that.showSummRepNoLogin != null)
            return false;
        if (canReturnQueues != null ? !canReturnQueues.equals(that.canReturnQueues) : that.canReturnQueues != null)
            return false;
        if (appointmentCronExpression != null ? !appointmentCronExpression.equals(that.appointmentCronExpression) : that.appointmentCronExpression != null)
            return false;
        if (canDirectTransferQueues != null ? !canDirectTransferQueues.equals(that.canDirectTransferQueues) : that.canDirectTransferQueues != null)
            return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (isAppointmentSchedulerEnabled != null ? !isAppointmentSchedulerEnabled.equals(that.isAppointmentSchedulerEnabled) : that.isAppointmentSchedulerEnabled != null)
            return false;
        if (appointmentUrl != null ? !appointmentUrl.equals(that.appointmentUrl) : that.appointmentUrl != null)
            return false;
        if (queueClearHour != null ? !queueClearHour.equals(that.queueClearHour) : that.queueClearHour != null)
            return false;
        if (queueClearMinute != null ? !queueClearMinute.equals(that.queueClearMinute) : that.queueClearMinute != null)
            return false;
        if (queueClearPeriod != null ? !queueClearPeriod.equals(that.queueClearPeriod) : that.queueClearPeriod != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (adRefreshInterval != null ? adRefreshInterval.hashCode() : 0);
        result = 31 * result + (allowDuplicateCounterNumber != null ? allowDuplicateCounterNumber.hashCode() : 0);
        result = 31 * result + (branchCode != null ? branchCode.hashCode() : 0);
        result = 31 * result + (callInterval != null ? callInterval.hashCode() : 0);
        result = 31 * result + (callPrefix != null ? callPrefix.hashCode() : 0);
        result = 31 * result + (callSection != null ? callSection.hashCode() : 0);
        result = 31 * result + (callSuffix != null ? callSuffix.hashCode() : 0);
        result = 31 * result + (companyFolder != null ? companyFolder.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (dateFormat != null ? dateFormat.hashCode() : 0);
        result = 31 * result + (displayAccouncement != null ? displayAccouncement.hashCode() : 0);
        result = 31 * result + (displayJsp != null ? displayJsp.hashCode() : 0);
        result = 31 * result + (end != null ? end.hashCode() : 0);
        result = 31 * result + (excludeReadCounter != null ? excludeReadCounter.hashCode() : 0);
        result = 31 * result + (fiveButtonPrinterComPort != null ? fiveButtonPrinterComPort.hashCode() : 0);
        result = 31 * result + (generateJsp != null ? generateJsp.hashCode() : 0);
        result = 31 * result + (generateQueueSmsMessage != null ? generateQueueSmsMessage.hashCode() : 0);
        result = 31 * result + (hasGenerateQueueSms != null ? hasGenerateQueueSms.hashCode() : 0);
        result = 31 * result + (hasImageHeader != null ? hasImageHeader.hashCode() : 0);
        result = 31 * result + (hasInitialSound != null ? hasInitialSound.hashCode() : 0);
        result = 31 * result + (hasNoTransactionEntries != null ? hasNoTransactionEntries.hashCode() : 0);
        result = 31 * result + (hasPostSound != null ? hasPostSound.hashCode() : 0);
        result = 31 * result + (hasQueueStatusSms != null ? hasQueueStatusSms.hashCode() : 0);
        result = 31 * result + (hasSeniorPatient != null ? hasSeniorPatient.hashCode() : 0);
        result = 31 * result + (hasTextHeader != null ? hasTextHeader.hashCode() : 0);
        result = 31 * result + (hasTransactions != null ? hasTransactions.hashCode() : 0);
        result = 31 * result + (hideTheTime != null ? hideTheTime.hashCode() : 0);
        result = 31 * result + (imageHeaderLocation != null ? imageHeaderLocation.hashCode() : 0);
        result = 31 * result + (includeDescriptionOnQueueTransaction != null ? includeDescriptionOnQueueTransaction.hashCode() : 0);
        result = 31 * result + (includeStandbyInProcessing != null ? includeStandbyInProcessing.hashCode() : 0);
        result = 31 * result + (inputQueueNotes != null ? inputQueueNotes.hashCode() : 0);
        result = 31 * result + (isFiveButtonPrinterEnabled != null ? isFiveButtonPrinterEnabled.hashCode() : 0);
        result = 31 * result + (isSoundBell != null ? isSoundBell.hashCode() : 0);
        result = 31 * result + (localeCode != null ? localeCode.hashCode() : 0);
        result = 31 * result + (maxNowServing != null ? maxNowServing.hashCode() : 0);
        result = 31 * result + (multipleTransactionTitle != null ? multipleTransactionTitle.hashCode() : 0);
        result = 31 * result + (noShowTime != null ? noShowTime.hashCode() : 0);
        result = 31 * result + (printHeader != null ? printHeader.hashCode() : 0);
        result = 31 * result + (queueStatusSmsMessage != null ? queueStatusSmsMessage.hashCode() : 0);
        result = 31 * result + (readAsWhole != null ? readAsWhole.hashCode() : 0);
        result = 31 * result + (readCountersAsWhole != null ? readCountersAsWhole.hashCode() : 0);
        result = 31 * result + (receptionTitle != null ? receptionTitle.hashCode() : 0);
        result = 31 * result + (recipientPositionForQueueStatusSms != null ? recipientPositionForQueueStatusSms.hashCode() : 0);
        result = 31 * result + (recipientSizeOfQueueStatusSms != null ? recipientSizeOfQueueStatusSms.hashCode() : 0);
        result = 31 * result + (repeatCall != null ? repeatCall.hashCode() : 0);
        result = 31 * result + (requireTransactions != null ? requireTransactions.hashCode() : 0);
        result = 31 * result + (showDataInsteadOfNumber != null ? showDataInsteadOfNumber.hashCode() : 0);
        result = 31 * result + (showNullOnQueueTransaction != null ? showNullOnQueueTransaction.hashCode() : 0);
        result = 31 * result + (smsComPort != null ? smsComPort.hashCode() : 0);
        result = 31 * result + (smsMessageCenterNumber != null ? smsMessageCenterNumber.hashCode() : 0);
        result = 31 * result + (smsNumber != null ? smsNumber.hashCode() : 0);
        result = 31 * result + (start != null ? start.hashCode() : 0);
        result = 31 * result + (tabularData != null ? tabularData.hashCode() : 0);
        result = 31 * result + (tellerIdentificationType != null ? tellerIdentificationType.hashCode() : 0);
        result = 31 * result + (transactionMapToService != null ? transactionMapToService.hashCode() : 0);
        result = 31 * result + (transferBySection != null ? transferBySection.hashCode() : 0);
        result = 31 * result + (tvStreamBroadcastAddress != null ? tvStreamBroadcastAddress.hashCode() : 0);
        result = 31 * result + (tvStreamPort != null ? tvStreamPort.hashCode() : 0);
        result = 31 * result + (tvStreamSourceAddress != null ? tvStreamSourceAddress.hashCode() : 0);
        result = 31 * result + (webServiceIp != null ? webServiceIp.hashCode() : 0);
        result = 31 * result + (botswanaWebSmsPassword != null ? botswanaWebSmsPassword.hashCode() : 0);
        result = 31 * result + (botswanaWebSmsUsername != null ? botswanaWebSmsUsername.hashCode() : 0);
        result = 31 * result + (canDownloadDataReport != null ? canDownloadDataReport.hashCode() : 0);
        result = 31 * result + (canDownloadQueueListOnCaller != null ? canDownloadQueueListOnCaller.hashCode() : 0);
        result = 31 * result + (canGroupServices != null ? canGroupServices.hashCode() : 0);
        result = 31 * result + (canMultiLoginCaller != null ? canMultiLoginCaller.hashCode() : 0);
        result = 31 * result + (canQueueFromSms != null ? canQueueFromSms.hashCode() : 0);
        result = 31 * result + (clickatellApikey != null ? clickatellApikey.hashCode() : 0);
        result = 31 * result + (contactNumber != null ? contactNumber.hashCode() : 0);
        result = 31 * result + (createVideoListFromVideoFolderFiles != null ? createVideoListFromVideoFolderFiles.hashCode() : 0);
        result = 31 * result + (disableCallerEditName != null ? disableCallerEditName.hashCode() : 0);
        result = 31 * result + (disabledCallerAlertMessage != null ? disabledCallerAlertMessage.hashCode() : 0);
        result = 31 * result + (enableLdap != null ? enableLdap.hashCode() : 0);
        result = 31 * result + (generateQueueOnCall != null ? generateQueueOnCall.hashCode() : 0);
        result = 31 * result + (generateQueueSmsMessagePart2 != null ? generateQueueSmsMessagePart2.hashCode() : 0);
        result = 31 * result + (hasBreakFunction != null ? hasBreakFunction.hashCode() : 0);
        result = 31 * result + (hasOngoingQueueSms != null ? hasOngoingQueueSms.hashCode() : 0);
        result = 31 * result + (hasOngoingQueueSms2 != null ? hasOngoingQueueSms2.hashCode() : 0);
        result = 31 * result + (hideSettingsOnCaller != null ? hideSettingsOnCaller.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (playVideosOnRandomOrder != null ? playVideosOnRandomOrder.hashCode() : 0);
        result = 31 * result + (printDuplicate != null ? printDuplicate.hashCode() : 0);
        result = 31 * result + (printEstWaiting != null ? printEstWaiting.hashCode() : 0);
        result = 31 * result + (printPosition != null ? printPosition.hashCode() : 0);
        result = 31 * result + (queueAssignedUserHasOwnNumberSequence != null ? queueAssignedUserHasOwnNumberSequence.hashCode() : 0);
        result = 31 * result + (queueSmsDupErrMsg != null ? queueSmsDupErrMsg.hashCode() : 0);
        result = 31 * result + (queueSmsDupErrMsgPart2 != null ? queueSmsDupErrMsgPart2.hashCode() : 0);
        result = 31 * result + (queueSmsHelpMessage != null ? queueSmsHelpMessage.hashCode() : 0);
        result = 31 * result + (queueSmsHelpMessagePart2 != null ? queueSmsHelpMessagePart2.hashCode() : 0);
        result = 31 * result + (queueStatusSmsMessage2 != null ? queueStatusSmsMessage2.hashCode() : 0);
        result = 31 * result + (queueStatusSmsMessage2Part2 != null ? queueStatusSmsMessage2Part2.hashCode() : 0);
        result = 31 * result + (queueStatusSmsMessagePart2 != null ? queueStatusSmsMessagePart2.hashCode() : 0);
        result = 31 * result + (queueStatusSmsMessagePosition != null ? queueStatusSmsMessagePosition.hashCode() : 0);
        result = 31 * result + (queueStatusSmsMessagePosition2 != null ? queueStatusSmsMessagePosition2.hashCode() : 0);
        result = 31 * result + (serviceHasAppointment != null ? serviceHasAppointment.hashCode() : 0);
        result = 31 * result + (serviceSurveyJsp != null ? serviceSurveyJsp.hashCode() : 0);
        result = 31 * result + (showCallerEditDataPopup != null ? showCallerEditDataPopup.hashCode() : 0);
        result = 31 * result + (showLastQueueCalledOnCaller != null ? showLastQueueCalledOnCaller.hashCode() : 0);
        result = 31 * result + (showTransactionTypeReport != null ? showTransactionTypeReport.hashCode() : 0);
        result = 31 * result + (smsServiceType != null ? smsServiceType.hashCode() : 0);
        result = 31 * result + (surveyHoursAgo != null ? surveyHoursAgo.hashCode() : 0);
        result = 31 * result + (surveySetting != null ? surveySetting.hashCode() : 0);
        result = 31 * result + (surveyType != null ? surveyType.hashCode() : 0);
        result = 31 * result + (twilioApiSid != null ? twilioApiSid.hashCode() : 0);
        result = 31 * result + (twilioApiToken != null ? twilioApiToken.hashCode() : 0);
        result = 31 * result + (twilioApiPhoneNumber != null ? twilioApiPhoneNumber.hashCode() : 0);
        result = 31 * result + (useClickatell != null ? useClickatell.hashCode() : 0);
        result = 31 * result + (isTmx80MmPrinter != null ? isTmx80MmPrinter.hashCode() : 0);
        result = 31 * result + (canAdministerQueue != null ? canAdministerQueue.hashCode() : 0);
        result = 31 * result + (canDisableCallerButtons != null ? canDisableCallerButtons.hashCode() : 0);
        result = 31 * result + (retainTransferPrefix != null ? retainTransferPrefix.hashCode() : 0);
        result = 31 * result + (viewerAdType != null ? viewerAdType.hashCode() : 0);
        result = 31 * result + (showSummRepNoLogin != null ? showSummRepNoLogin.hashCode() : 0);
        result = 31 * result + (canReturnQueues != null ? canReturnQueues.hashCode() : 0);
        result = 31 * result + (appointmentCronExpression != null ? appointmentCronExpression.hashCode() : 0);
        result = 31 * result + (canDirectTransferQueues != null ? canDirectTransferQueues.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (isAppointmentSchedulerEnabled != null ? isAppointmentSchedulerEnabled.hashCode() : 0);
        result = 31 * result + (appointmentUrl != null ? appointmentUrl.hashCode() : 0);
        result = 31 * result + (queueClearHour != null ? queueClearHour.hashCode() : 0);
        result = 31 * result + (queueClearMinute != null ? queueClearMinute.hashCode() : 0);
        result = 31 * result + (queueClearPeriod != null ? queueClearPeriod.hashCode() : 0);
        return result;
    }
}
