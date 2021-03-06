
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 */
@WebService(name = "AuditWebServiceSoap", targetNamespace = "http://tempuri.org/")
public interface AuditWebServiceSoap {


    /**
     * @param inHasUpdate4Claim
     * @param inClaimInfo
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "ClaimAudit4Hospital", action = "http://tempuri.org/ClaimAudit4Hospital")
    @WebResult(name = "ClaimAudit4HospitalResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ClaimAudit4Hospital", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ClaimAudit4Hospital")
    @ResponseWrapper(localName = "ClaimAudit4HospitalResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ClaimAudit4HospitalResponse")
    public String claimAudit4Hospital(@WebParam(name = "inClaimInfo", targetNamespace = "http://tempuri.org/") String inClaimInfo,
                                      @WebParam(name = "inHasUpdate4Claim", targetNamespace = "http://tempuri.org/") boolean inHasUpdate4Claim);

    /**
     * @param inHasUpdate4Claim
     * @param inClaimInfo
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "ClaimAudit4HospitalNewOne", action = "http://tempuri.org/ClaimAudit4HospitalNewOne")
    @WebResult(name = "ClaimAudit4HospitalNewOneResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ClaimAudit4HospitalNewOne", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ClaimAudit4HospitalNewOne")
    @ResponseWrapper(localName = "ClaimAudit4HospitalNewOneResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ClaimAudit4HospitalNewOneResponse")
    public String claimAudit4HospitalNewOne(@WebParam(name = "inClaimInfo", targetNamespace = "http://tempuri.org/") String inClaimInfo,
                                            @WebParam(name = "inHasUpdate4Claim", targetNamespace = "http://tempuri.org/") boolean inHasUpdate4Claim);

    /**
     * @param inHasUpdate4Claim
     * @param inClaimInfo
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "ClaimSave4Hospital", action = "http://tempuri.org/ClaimSave4Hospital")
    @WebResult(name = "ClaimSave4HospitalResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ClaimSave4Hospital", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ClaimSave4Hospital")
    @ResponseWrapper(localName = "ClaimSave4HospitalResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ClaimSave4HospitalResponse")
    public String claimSave4Hospital(@WebParam(name = "inClaimInfo", targetNamespace = "http://tempuri.org/") String inClaimInfo,
                                     @WebParam(name = "inHasUpdate4Claim", targetNamespace = "http://tempuri.org/") boolean inHasUpdate4Claim);

    /**
     * @param inClaimInfo
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "ClaimUpdate4Hospital", action = "http://tempuri.org/ClaimUpdate4Hospital")
    @WebResult(name = "ClaimUpdate4HospitalResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ClaimUpdate4Hospital", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ClaimUpdate4Hospital")
    @ResponseWrapper(localName = "ClaimUpdate4HospitalResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ClaimUpdate4HospitalResponse")
    public String claimUpdate4Hospital(@WebParam(name = "inClaimInfo", targetNamespace = "http://tempuri.org/") String inClaimInfo);

    /**
     * @param inClaimID
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "ClaimDelete4Hospital", action = "http://tempuri.org/ClaimDelete4Hospital")
    @WebResult(name = "ClaimDelete4HospitalResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ClaimDelete4Hospital", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ClaimDelete4Hospital")
    @ResponseWrapper(localName = "ClaimDelete4HospitalResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ClaimDelete4HospitalResponse")
    public String claimDelete4Hospital(@WebParam(name = "inClaimID", targetNamespace = "http://tempuri.org/") String inClaimID);

    /**
     * @param inTipsCode
     * @return returns org.tempuri.ArrayOfString
     */
    @WebMethod(operationName = "GetFullTips", action = "http://tempuri.org/GetFullTips")
    @WebResult(name = "GetFullTipsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetFullTips", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetFullTips")
    @ResponseWrapper(localName = "GetFullTipsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetFullTipsResponse")
    public String getFullTips(@WebParam(name = "inTipsCode", targetNamespace = "http://tempuri.org/") String inTipsCode);

    /**
     * @param inClaimID
     * @param inRuleCode
     * @param inRelatedString
     * @param inPatientIDStr
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "GetRelatedDetail", action = "http://tempuri.org/GetRelatedDetail")
    @WebResult(name = "GetRelatedDetailResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetRelatedDetail", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetRelatedDetail")
    @ResponseWrapper(localName = "GetRelatedDetailResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetRelatedDetailResponse")
    public String getRelatedDetail(@WebParam(name = "inPatientIDStr", targetNamespace = "http://tempuri.org/") String inPatientIDStr,
                                   @WebParam(name = "inClaimID", targetNamespace = "http://tempuri.org/") String inClaimID,
                                   @WebParam(name = "inRuleCode", targetNamespace = "http://tempuri.org/") String inRuleCode,
                                   @WebParam(name = "inRelatedString", targetNamespace = "http://tempuri.org/") String inRelatedString);

    /**
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "GetRuleNames", action = "http://tempuri.org/GetRuleNames")
    @WebResult(name = "GetRuleNamesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetRuleNames", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetRuleNames")
    @ResponseWrapper(localName = "GetRuleNamesResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetRuleNamesResponse")
    public String getRuleNames();

    /**
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "GetLimitCodes", action = "http://tempuri.org/GetLimitCodes")
    @WebResult(name = "GetLimitCodesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetLimitCodes", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetLimitCodes")
    @ResponseWrapper(localName = "GetLimitCodesResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetLimitCodesResponse")
    public String getLimitCodes();

    /**
     * @param inType
     * @param inEndDT
     * @param inName
     * @param inStartDT
     * @param inApprovalNumber
     * @param inPatientIDStr
     * @param inCode
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "AddPutOnRecord4Hospital", action = "http://tempuri.org/AddPutOnRecord4Hospital")
    @WebResult(name = "AddPutOnRecord4HospitalResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AddPutOnRecord4Hospital", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddPutOnRecord4Hospital")
    @ResponseWrapper(localName = "AddPutOnRecord4HospitalResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddPutOnRecord4HospitalResponse")
    public String addPutOnRecord4Hospital(@WebParam(name = "inType", targetNamespace = "http://tempuri.org/") int inType,
                                          @WebParam(name = "inCode", targetNamespace = "http://tempuri.org/") String inCode,
                                          @WebParam(name = "inName", targetNamespace = "http://tempuri.org/") String inName,
                                          @WebParam(name = "inPatient_IDStr", targetNamespace = "http://tempuri.org/") String inPatientIDStr,
                                          @WebParam(name = "inApprovalNumber", targetNamespace = "http://tempuri.org/") String inApprovalNumber,
                                          @WebParam(name = "inStartDT", targetNamespace = "http://tempuri.org/") String inStartDT,
                                          @WebParam(name = "inEndDT", targetNamespace = "http://tempuri.org/") String inEndDT);

    /**
     * @param inBKF085
     * @param inBKC043
     * @param inType
     * @param inHOSPITALID
     * @param inHOSPITALLEVEL
     * @param inEndDT
     * @param inName
     * @param inStartDT
     * @param inApprovalNumber
     * @param inPatientIDStr
     * @param inCode
     * @param inBKF053
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "AddPutOnRecord4Hospital_N1", action = "http://tempuri.org/AddPutOnRecord4Hospital_N1")
    @WebResult(name = "AddPutOnRecord4Hospital_N1Result", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AddPutOnRecord4Hospital_N1", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddPutOnRecord4HospitalN1")
    @ResponseWrapper(localName = "AddPutOnRecord4Hospital_N1Response", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddPutOnRecord4HospitalN1Response")
    public String addPutOnRecord4HospitalN1(@WebParam(name = "inType", targetNamespace = "http://tempuri.org/") int inType,
                                            @WebParam(name = "inCode", targetNamespace = "http://tempuri.org/") String inCode,
                                            @WebParam(name = "inName", targetNamespace = "http://tempuri.org/") String inName,
                                            @WebParam(name = "inPatient_IDStr", targetNamespace = "http://tempuri.org/") String inPatientIDStr,
                                            @WebParam(name = "inApprovalNumber", targetNamespace = "http://tempuri.org/") String inApprovalNumber,
                                            @WebParam(name = "inStartDT", targetNamespace = "http://tempuri.org/") String inStartDT,
                                            @WebParam(name = "inEndDT", targetNamespace = "http://tempuri.org/") String inEndDT,
                                            @WebParam(name = "inBKC043", targetNamespace = "http://tempuri.org/") String inBKC043,
                                            @WebParam(name = "inHOSPITAL_ID", targetNamespace = "http://tempuri.org/") String inHOSPITALID,
                                            @WebParam(name = "inHOSPITAL_LEVEL", targetNamespace = "http://tempuri.org/") String inHOSPITALLEVEL,
                                            @WebParam(name = "inBKF053", targetNamespace = "http://tempuri.org/") String inBKF053,
                                            @WebParam(name = "inBKF085", targetNamespace = "http://tempuri.org/") String inBKF085);

    /**
     * @param inType
     * @param inPatientIDStr
     * @param inCode
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "DeletePutOnRecord4Hospital", action = "http://tempuri.org/DeletePutOnRecord4Hospital")
    @WebResult(name = "DeletePutOnRecord4HospitalResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeletePutOnRecord4Hospital", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DeletePutOnRecord4Hospital")
    @ResponseWrapper(localName = "DeletePutOnRecord4HospitalResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DeletePutOnRecord4HospitalResponse")
    public String deletePutOnRecord4Hospital(@WebParam(name = "inType", targetNamespace = "http://tempuri.org/") int inType,
                                             @WebParam(name = "inCode", targetNamespace = "http://tempuri.org/") String inCode,
                                             @WebParam(name = "inPatient_IDStr", targetNamespace = "http://tempuri.org/") String inPatientIDStr);

    /**
     * @param inDetailID
     * @param inClaimID
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "DeleteDetail4Hospital", action = "http://tempuri.org/DeleteDetail4Hospital")
    @WebResult(name = "DeleteDetail4HospitalResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteDetail4Hospital", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DeleteDetail4Hospital")
    @ResponseWrapper(localName = "DeleteDetail4HospitalResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DeleteDetail4HospitalResponse")
    public String deleteDetail4Hospital(@WebParam(name = "inClaimID", targetNamespace = "http://tempuri.org/") String inClaimID,
                                        @WebParam(name = "inDetailID", targetNamespace = "http://tempuri.org/") String inDetailID);

    /**
     * @param inClaimID
     * @param inRuleType
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "AuditCacheNotWithResult", action = "http://tempuri.org/AuditCacheNotWithResult")
    @WebResult(name = "AuditCacheNotWithResultResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AuditCacheNotWithResult", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AuditCacheNotWithResult")
    @ResponseWrapper(localName = "AuditCacheNotWithResultResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AuditCacheNotWithResultResponse")
    public String auditCacheNotWithResult(@WebParam(name = "inClaimID", targetNamespace = "http://tempuri.org/") String inClaimID,
                                          @WebParam(name = "inRuleType", targetNamespace = "http://tempuri.org/") String inRuleType);

    /**
     * @param inClaimID
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "AuditCacheWithResult", action = "http://tempuri.org/AuditCacheWithResult")
    @WebResult(name = "AuditCacheWithResultResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AuditCacheWithResult", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AuditCacheWithResult")
    @ResponseWrapper(localName = "AuditCacheWithResultResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AuditCacheWithResultResponse")
    public String auditCacheWithResult(@WebParam(name = "inClaimID", targetNamespace = "http://tempuri.org/") String inClaimID);

    /**
     * @param inClaimID
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "AuditCacheWithResult_ONE", action = "http://tempuri.org/AuditCacheWithResult_ONE")
    @WebResult(name = "AuditCacheWithResult_ONEResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AuditCacheWithResult_ONE", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AuditCacheWithResultONE")
    @ResponseWrapper(localName = "AuditCacheWithResult_ONEResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AuditCacheWithResultONEResponse")
    public String auditCacheWithResultONE(@WebParam(name = "inClaimID", targetNamespace = "http://tempuri.org/") String inClaimID);

    /**
     * @param inDetailID
     * @param inClaimID
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "GetBillDetailList_ONE", action = "http://tempuri.org/GetBillDetailList_ONE")
    @WebResult(name = "GetBillDetailList_ONEResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetBillDetailList_ONE", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetBillDetailListONE")
    @ResponseWrapper(localName = "GetBillDetailList_ONEResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetBillDetailListONEResponse")
    public String getBillDetailListONE(@WebParam(name = "inClaimID", targetNamespace = "http://tempuri.org/") String inClaimID,
                                       @WebParam(name = "inDetailID", targetNamespace = "http://tempuri.org/") String inDetailID);

    /**
     * @param inClaimID
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "AuditGetCostsResult", action = "http://tempuri.org/AuditGetCostsResult")
    @WebResult(name = "AuditGetCostsResultResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AuditGetCostsResult", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AuditGetCostsResult")
    @ResponseWrapper(localName = "AuditGetCostsResultResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AuditGetCostsResultResponse")
    public String auditGetCostsResult(@WebParam(name = "inClaimID", targetNamespace = "http://tempuri.org/") String inClaimID);

    /**
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "Helloworld", action = "http://tempuri.org/Helloworld")
    @WebResult(name = "HelloworldResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Helloworld", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Helloworld")
    @ResponseWrapper(localName = "HelloworldResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.HelloworldResponse")
    public String helloworld();

    /**
     * @param eDate
     * @param patientIDStr
     * @param sDate
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "GetbillList", action = "http://tempuri.org/GetbillList")
    @WebResult(name = "GetbillListResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetbillList", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetbillList")
    @ResponseWrapper(localName = "GetbillListResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetbillListResponse")
    public String getbillList(@WebParam(name = "s_date", targetNamespace = "http://tempuri.org/") String sDate,
                              @WebParam(name = "e_date", targetNamespace = "http://tempuri.org/") String eDate,
                              @WebParam(name = "Patient_IDStr", targetNamespace = "http://tempuri.org/") String patientIDStr);

    /**
     * @param inClaimID
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "GetBillDetailList", action = "http://tempuri.org/GetBillDetailList")
    @WebResult(name = "GetBillDetailListResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetBillDetailList", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetBillDetailList")
    @ResponseWrapper(localName = "GetBillDetailListResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetBillDetailListResponse")
    public String getBillDetailList(@WebParam(name = "inClaimID", targetNamespace = "http://tempuri.org/") String inClaimID);

    /**
     * @param inClaimID
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "GetCacheBillDetailList", action = "http://tempuri.org/GetCacheBillDetailList")
    @WebResult(name = "GetCacheBillDetailListResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetCacheBillDetailList", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetCacheBillDetailList")
    @ResponseWrapper(localName = "GetCacheBillDetailListResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetCacheBillDetailListResponse")
    public String getCacheBillDetailList(@WebParam(name = "inClaimID", targetNamespace = "http://tempuri.org/") String inClaimID);

    /**
     * @param inPatientIDStr
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "GetPutOnRecordList", action = "http://tempuri.org/GetPutOnRecordList")
    @WebResult(name = "GetPutOnRecordListResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetPutOnRecordList", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetPutOnRecordList")
    @ResponseWrapper(localName = "GetPutOnRecordListResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetPutOnRecordListResponse")
    public String getPutOnRecordList(@WebParam(name = "inPatient_IDStr", targetNamespace = "http://tempuri.org/") String inPatientIDStr);

    /**
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "GetResultTypes", action = "http://tempuri.org/GetResultTypes")
    @WebResult(name = "GetResultTypesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetResultTypes", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetResultTypes")
    @ResponseWrapper(localName = "GetResultTypesResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetResultTypesResponse")
    public String getResultTypes();

    /**
     * @param inClaimID
     * @param inHSSTATUS
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "UpDataHS_STATUS", action = "http://tempuri.org/UpDataHS_STATUS")
    @WebResult(name = "UpDataHS_STATUSResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UpDataHS_STATUS", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpDataHSSTATUS")
    @ResponseWrapper(localName = "UpDataHS_STATUSResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpDataHSSTATUSResponse")
    public String upDataHSSTATUS(@WebParam(name = "inClaimID", targetNamespace = "http://tempuri.org/") String inClaimID,
                                 @WebParam(name = "inHS_STATUS", targetNamespace = "http://tempuri.org/") String inHSSTATUS);

    /**
     * @param inKeyName
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "GetAppSettings", action = "http://tempuri.org/GetAppSettings")
    @WebResult(name = "GetAppSettingsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetAppSettings", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAppSettings")
    @ResponseWrapper(localName = "GetAppSettingsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAppSettingsResponse")
    public String getAppSettings(@WebParam(name = "inKeyName", targetNamespace = "http://tempuri.org/") String inKeyName);

    /**
     * @param inDetailID
     * @param inClaimID
     * @param inZZZFlag
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "UpDataDetail_ZZZ_Flag", action = "http://tempuri.org/UpDataDetail_ZZZ_Flag")
    @WebResult(name = "UpDataDetail_ZZZ_FlagResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UpDataDetail_ZZZ_Flag", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpDataDetailZZZFlag")
    @ResponseWrapper(localName = "UpDataDetail_ZZZ_FlagResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpDataDetailZZZFlagResponse")
    public String upDataDetailZZZFlag(@WebParam(name = "inClaimID", targetNamespace = "http://tempuri.org/") String inClaimID,
                                      @WebParam(name = "inDetailID", targetNamespace = "http://tempuri.org/") String inDetailID,
                                      @WebParam(name = "inZZZ_Flag", targetNamespace = "http://tempuri.org/") String inZZZFlag);

    /**
     * @param inClaimID
     * @param inZZZFlag
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "UpDataClaimID_ZZZ_Flag", action = "http://tempuri.org/UpDataClaimID_ZZZ_Flag")
    @WebResult(name = "UpDataClaimID_ZZZ_FlagResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UpDataClaimID_ZZZ_Flag", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpDataClaimIDZZZFlag")
    @ResponseWrapper(localName = "UpDataClaimID_ZZZ_FlagResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpDataClaimIDZZZFlagResponse")
    public String upDataClaimIDZZZFlag(@WebParam(name = "inClaimID", targetNamespace = "http://tempuri.org/") String inClaimID,
                                       @WebParam(name = "inZZZ_Flag", targetNamespace = "http://tempuri.org/") String inZZZFlag);

    /**
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "GetDATE", action = "http://tempuri.org/GetDATE")
    @WebResult(name = "GetDATEResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetDATE", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetDATE")
    @ResponseWrapper(localName = "GetDATEResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetDATEResponse")
    public String getDATE();

    /**
     * @param inClaimID
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "DeleteNoAccountingRecord", action = "http://tempuri.org/DeleteNoAccountingRecord")
    @WebResult(name = "DeleteNoAccountingRecordResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteNoAccountingRecord", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DeleteNoAccountingRecord")
    @ResponseWrapper(localName = "DeleteNoAccountingRecordResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DeleteNoAccountingRecordResponse")
    public String deleteNoAccountingRecord(@WebParam(name = "inClaimID", targetNamespace = "http://tempuri.org/") String inClaimID);

    /**
     * @param clientCode
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "Getstdcode", action = "http://tempuri.org/Getstdcode")
    @WebResult(name = "GetstdcodeResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Getstdcode", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Getstdcode")
    @ResponseWrapper(localName = "GetstdcodeResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetstdcodeResponse")
    public String getstdcode(@WebParam(name = "client_code", targetNamespace = "http://tempuri.org/") String clientCode);

    /**
     * @param inDetailID
     * @param inClaimID
     * @param inBm
     * @param inKfyy
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "SavekfReson", action = "http://tempuri.org/SavekfReson")
    @WebResult(name = "SavekfResonResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SavekfReson", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SavekfReson")
    @ResponseWrapper(localName = "SavekfResonResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SavekfResonResponse")
    public String savekfReson(@WebParam(name = "inClaimID", targetNamespace = "http://tempuri.org/") String inClaimID,
                              @WebParam(name = "inDetailID", targetNamespace = "http://tempuri.org/") String inDetailID,
                              @WebParam(name = "inBm", targetNamespace = "http://tempuri.org/") String inBm,
                              @WebParam(name = "inKfyy", targetNamespace = "http://tempuri.org/") String inKfyy);

    /**
     * @param inFlag
     * @param inClaimID
     * @param inAuditResultXml
     * @param inAuditXml
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "SavekfWarnEnforced", action = "http://tempuri.org/SavekfWarnEnforced")
    @WebResult(name = "SavekfWarnEnforcedResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SavekfWarnEnforced", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SavekfWarnEnforced")
    @ResponseWrapper(localName = "SavekfWarnEnforcedResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SavekfWarnEnforcedResponse")
    public String savekfWarnEnforced(@WebParam(name = "inClaimID", targetNamespace = "http://tempuri.org/") String inClaimID,
                                     @WebParam(name = "inFlag", targetNamespace = "http://tempuri.org/") String inFlag,
                                     @WebParam(name = "inAuditXml", targetNamespace = "http://tempuri.org/") String inAuditXml,
                                     @WebParam(name = "inAuditResultXml", targetNamespace = "http://tempuri.org/") String inAuditResultXml);

    /**
     * @param inFlag
     * @param inClaimID
     * @param solveResen
     * @param inAuditResultXml
     * @param warnID
     * @param inAuditXml
     * @param ip
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "SavekfWarnEnforced_new", action = "http://tempuri.org/SavekfWarnEnforced_new")
    @WebResult(name = "SavekfWarnEnforced_newResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SavekfWarnEnforced_new", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SavekfWarnEnforcedNew")
    @ResponseWrapper(localName = "SavekfWarnEnforced_newResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SavekfWarnEnforcedNewResponse")
    public String savekfWarnEnforcedNew(@WebParam(name = "inClaimID", targetNamespace = "http://tempuri.org/") String inClaimID,
                                        @WebParam(name = "inFlag", targetNamespace = "http://tempuri.org/") String inFlag,
                                        @WebParam(name = "inAuditXml", targetNamespace = "http://tempuri.org/") String inAuditXml,
                                        @WebParam(name = "inAuditResultXml", targetNamespace = "http://tempuri.org/") String inAuditResultXml,
                                        @WebParam(name = "WarnID", targetNamespace = "http://tempuri.org/") String warnID,
                                        @WebParam(name = "SolveResen", targetNamespace = "http://tempuri.org/") String solveResen,
                                        @WebParam(name = "IP", targetNamespace = "http://tempuri.org/") String ip);

    /**
     * @param inRuleCode
     * @param inStdCode
     * @param inHospitalID
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "GetDiagnosis", action = "http://tempuri.org/GetDiagnosis")
    @WebResult(name = "GetDiagnosisResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetDiagnosis", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetDiagnosis")
    @ResponseWrapper(localName = "GetDiagnosisResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetDiagnosisResponse")
    public String getDiagnosis(@WebParam(name = "inHospitalID", targetNamespace = "http://tempuri.org/") String inHospitalID,
                               @WebParam(name = "inStd_Code", targetNamespace = "http://tempuri.org/") String inStdCode,
                               @WebParam(name = "inRule_Code", targetNamespace = "http://tempuri.org/") String inRuleCode);

    /**
     * @param hospitalId
     * @param settleDate
     * @param hisid
     * @param mac
     * @param ip
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "SaveAuditRecord", action = "http://tempuri.org/SaveAuditRecord")
    @WebResult(name = "SaveAuditRecordResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SaveAuditRecord", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SaveAuditRecord")
    @ResponseWrapper(localName = "SaveAuditRecordResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SaveAuditRecordResponse")
    public String saveAuditRecord(@WebParam(name = "ip", targetNamespace = "http://tempuri.org/") String ip,
                                  @WebParam(name = "mac", targetNamespace = "http://tempuri.org/") String mac,
                                  @WebParam(name = "hospital_id", targetNamespace = "http://tempuri.org/") String hospitalId,
                                  @WebParam(name = "hisid", targetNamespace = "http://tempuri.org/") String hisid,
                                  @WebParam(name = "settle_date", targetNamespace = "http://tempuri.org/") String settleDate);

}
