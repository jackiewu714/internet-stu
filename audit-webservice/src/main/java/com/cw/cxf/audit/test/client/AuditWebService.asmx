<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:element name="ClaimAudit4Hospital">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimInfo" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="inHasUpdate4Claim" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClaimAudit4HospitalResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ClaimAudit4HospitalResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClaimAudit4HospitalNewOne">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimInfo" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="inHasUpdate4Claim" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClaimAudit4HospitalNewOneResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ClaimAudit4HospitalNewOneResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClaimSave4Hospital">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimInfo" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="inHasUpdate4Claim" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClaimSave4HospitalResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ClaimSave4HospitalResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClaimUpdate4Hospital">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimInfo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClaimUpdate4HospitalResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ClaimUpdate4HospitalResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClaimDelete4Hospital">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClaimDelete4HospitalResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ClaimDelete4HospitalResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFullTips">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inTipsCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFullTipsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFullTipsResult" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfString">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="string" nillable="true" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetRelatedDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inPatientIDStr" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inClaimID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inRuleCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inRelatedString" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRelatedDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRelatedDetailResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRuleNames">
        <s:complexType />
      </s:element>
      <s:element name="GetRuleNamesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRuleNamesResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLimitCodes">
        <s:complexType />
      </s:element>
      <s:element name="GetLimitCodesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetLimitCodesResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddPutOnRecord4Hospital">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="inType" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="inCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inPatient_IDStr" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inApprovalNumber" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inStartDT" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inEndDT" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddPutOnRecord4HospitalResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AddPutOnRecord4HospitalResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddPutOnRecord4Hospital_N1">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="inType" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="inCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inPatient_IDStr" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inApprovalNumber" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inStartDT" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inEndDT" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inBKC043" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddPutOnRecord4Hospital_N1Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AddPutOnRecord4Hospital_N1Result" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DeletePutOnRecord4Hospital">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="inType" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="inCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inPatient_IDStr" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DeletePutOnRecord4HospitalResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DeletePutOnRecord4HospitalResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DeleteDetail4Hospital">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inDetailID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DeleteDetail4HospitalResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DeleteDetail4HospitalResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AuditCacheNotWithResult">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inRuleType" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AuditCacheNotWithResultResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AuditCacheNotWithResultResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AuditCacheWithResult">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AuditCacheWithResultResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AuditCacheWithResultResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AuditCacheWithResult_ONE">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AuditCacheWithResult_ONEResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AuditCacheWithResult_ONEResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetBillDetailList_ONE">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inDetailID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetBillDetailList_ONEResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetBillDetailList_ONEResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AuditGetCostsResult">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AuditGetCostsResultResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AuditGetCostsResultResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Helloworld">
        <s:complexType />
      </s:element>
      <s:element name="HelloworldResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="HelloworldResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetbillList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="s_date" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="e_date" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Patient_IDStr" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetbillListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetbillListResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetBillDetailList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetBillDetailListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetBillDetailListResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCacheBillDetailList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCacheBillDetailListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCacheBillDetailListResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPutOnRecordList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inPatient_IDStr" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPutOnRecordListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPutOnRecordListResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetResultTypes">
        <s:complexType />
      </s:element>
      <s:element name="GetResultTypesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetResultTypesResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpDataHS_STATUS">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inHS_STATUS" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpDataHS_STATUSResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="UpDataHS_STATUSResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAppSettings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inKeyName" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAppSettingsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAppSettingsResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpDataDetail_ZZZ_Flag">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inDetailID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inZZZ_Flag" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpDataDetail_ZZZ_FlagResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="UpDataDetail_ZZZ_FlagResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpDataClaimID_ZZZ_Flag">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inZZZ_Flag" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpDataClaimID_ZZZ_FlagResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="UpDataClaimID_ZZZ_FlagResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDATE">
        <s:complexType />
      </s:element>
      <s:element name="GetDATEResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetDATEResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DeleteNoAccountingRecord">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DeleteNoAccountingRecordResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DeleteNoAccountingRecordResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Getstdcode">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="client_code" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetstdcodeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetstdcodeResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SavekfReson">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inDetailID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inBm" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inKfyy" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SavekfResonResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SavekfResonResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SavekfWarnEnforced">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inFlag" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inAuditXml" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inAuditResultXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SavekfWarnEnforcedResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SavekfWarnEnforcedResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SavekfWarnEnforced_new">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inClaimID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inFlag" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inAuditXml" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inAuditResultXml" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WarnID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="SolveResen" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="IP" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SavekfWarnEnforced_newResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SavekfWarnEnforced_newResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDiagnosis">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inHospitalID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inStd_Code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inRule_Code" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDiagnosisResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetDiagnosisResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="ClaimAudit4HospitalSoapIn">
    <wsdl:part name="parameters" element="tns:ClaimAudit4Hospital" />
  </wsdl:message>
  <wsdl:message name="ClaimAudit4HospitalSoapOut">
    <wsdl:part name="parameters" element="tns:ClaimAudit4HospitalResponse" />
  </wsdl:message>
  <wsdl:message name="ClaimAudit4HospitalNewOneSoapIn">
    <wsdl:part name="parameters" element="tns:ClaimAudit4HospitalNewOne" />
  </wsdl:message>
  <wsdl:message name="ClaimAudit4HospitalNewOneSoapOut">
    <wsdl:part name="parameters" element="tns:ClaimAudit4HospitalNewOneResponse" />
  </wsdl:message>
  <wsdl:message name="ClaimSave4HospitalSoapIn">
    <wsdl:part name="parameters" element="tns:ClaimSave4Hospital" />
  </wsdl:message>
  <wsdl:message name="ClaimSave4HospitalSoapOut">
    <wsdl:part name="parameters" element="tns:ClaimSave4HospitalResponse" />
  </wsdl:message>
  <wsdl:message name="ClaimUpdate4HospitalSoapIn">
    <wsdl:part name="parameters" element="tns:ClaimUpdate4Hospital" />
  </wsdl:message>
  <wsdl:message name="ClaimUpdate4HospitalSoapOut">
    <wsdl:part name="parameters" element="tns:ClaimUpdate4HospitalResponse" />
  </wsdl:message>
  <wsdl:message name="ClaimDelete4HospitalSoapIn">
    <wsdl:part name="parameters" element="tns:ClaimDelete4Hospital" />
  </wsdl:message>
  <wsdl:message name="ClaimDelete4HospitalSoapOut">
    <wsdl:part name="parameters" element="tns:ClaimDelete4HospitalResponse" />
  </wsdl:message>
  <wsdl:message name="GetFullTipsSoapIn">
    <wsdl:part name="parameters" element="tns:GetFullTips" />
  </wsdl:message>
  <wsdl:message name="GetFullTipsSoapOut">
    <wsdl:part name="parameters" element="tns:GetFullTipsResponse" />
  </wsdl:message>
  <wsdl:message name="GetRelatedDetailSoapIn">
    <wsdl:part name="parameters" element="tns:GetRelatedDetail" />
  </wsdl:message>
  <wsdl:message name="GetRelatedDetailSoapOut">
    <wsdl:part name="parameters" element="tns:GetRelatedDetailResponse" />
  </wsdl:message>
  <wsdl:message name="GetRuleNamesSoapIn">
    <wsdl:part name="parameters" element="tns:GetRuleNames" />
  </wsdl:message>
  <wsdl:message name="GetRuleNamesSoapOut">
    <wsdl:part name="parameters" element="tns:GetRuleNamesResponse" />
  </wsdl:message>
  <wsdl:message name="GetLimitCodesSoapIn">
    <wsdl:part name="parameters" element="tns:GetLimitCodes" />
  </wsdl:message>
  <wsdl:message name="GetLimitCodesSoapOut">
    <wsdl:part name="parameters" element="tns:GetLimitCodesResponse" />
  </wsdl:message>
  <wsdl:message name="AddPutOnRecord4HospitalSoapIn">
    <wsdl:part name="parameters" element="tns:AddPutOnRecord4Hospital" />
  </wsdl:message>
  <wsdl:message name="AddPutOnRecord4HospitalSoapOut">
    <wsdl:part name="parameters" element="tns:AddPutOnRecord4HospitalResponse" />
  </wsdl:message>
  <wsdl:message name="AddPutOnRecord4Hospital_N1SoapIn">
    <wsdl:part name="parameters" element="tns:AddPutOnRecord4Hospital_N1" />
  </wsdl:message>
  <wsdl:message name="AddPutOnRecord4Hospital_N1SoapOut">
    <wsdl:part name="parameters" element="tns:AddPutOnRecord4Hospital_N1Response" />
  </wsdl:message>
  <wsdl:message name="DeletePutOnRecord4HospitalSoapIn">
    <wsdl:part name="parameters" element="tns:DeletePutOnRecord4Hospital" />
  </wsdl:message>
  <wsdl:message name="DeletePutOnRecord4HospitalSoapOut">
    <wsdl:part name="parameters" element="tns:DeletePutOnRecord4HospitalResponse" />
  </wsdl:message>
  <wsdl:message name="DeleteDetail4HospitalSoapIn">
    <wsdl:part name="parameters" element="tns:DeleteDetail4Hospital" />
  </wsdl:message>
  <wsdl:message name="DeleteDetail4HospitalSoapOut">
    <wsdl:part name="parameters" element="tns:DeleteDetail4HospitalResponse" />
  </wsdl:message>
  <wsdl:message name="AuditCacheNotWithResultSoapIn">
    <wsdl:part name="parameters" element="tns:AuditCacheNotWithResult" />
  </wsdl:message>
  <wsdl:message name="AuditCacheNotWithResultSoapOut">
    <wsdl:part name="parameters" element="tns:AuditCacheNotWithResultResponse" />
  </wsdl:message>
  <wsdl:message name="AuditCacheWithResultSoapIn">
    <wsdl:part name="parameters" element="tns:AuditCacheWithResult" />
  </wsdl:message>
  <wsdl:message name="AuditCacheWithResultSoapOut">
    <wsdl:part name="parameters" element="tns:AuditCacheWithResultResponse" />
  </wsdl:message>
  <wsdl:message name="AuditCacheWithResult_ONESoapIn">
    <wsdl:part name="parameters" element="tns:AuditCacheWithResult_ONE" />
  </wsdl:message>
  <wsdl:message name="AuditCacheWithResult_ONESoapOut">
    <wsdl:part name="parameters" element="tns:AuditCacheWithResult_ONEResponse" />
  </wsdl:message>
  <wsdl:message name="GetBillDetailList_ONESoapIn">
    <wsdl:part name="parameters" element="tns:GetBillDetailList_ONE" />
  </wsdl:message>
  <wsdl:message name="GetBillDetailList_ONESoapOut">
    <wsdl:part name="parameters" element="tns:GetBillDetailList_ONEResponse" />
  </wsdl:message>
  <wsdl:message name="AuditGetCostsResultSoapIn">
    <wsdl:part name="parameters" element="tns:AuditGetCostsResult" />
  </wsdl:message>
  <wsdl:message name="AuditGetCostsResultSoapOut">
    <wsdl:part name="parameters" element="tns:AuditGetCostsResultResponse" />
  </wsdl:message>
  <wsdl:message name="HelloworldSoapIn">
    <wsdl:part name="parameters" element="tns:Helloworld" />
  </wsdl:message>
  <wsdl:message name="HelloworldSoapOut">
    <wsdl:part name="parameters" element="tns:HelloworldResponse" />
  </wsdl:message>
  <wsdl:message name="GetbillListSoapIn">
    <wsdl:part name="parameters" element="tns:GetbillList" />
  </wsdl:message>
  <wsdl:message name="GetbillListSoapOut">
    <wsdl:part name="parameters" element="tns:GetbillListResponse" />
  </wsdl:message>
  <wsdl:message name="GetBillDetailListSoapIn">
    <wsdl:part name="parameters" element="tns:GetBillDetailList" />
  </wsdl:message>
  <wsdl:message name="GetBillDetailListSoapOut">
    <wsdl:part name="parameters" element="tns:GetBillDetailListResponse" />
  </wsdl:message>
  <wsdl:message name="GetCacheBillDetailListSoapIn">
    <wsdl:part name="parameters" element="tns:GetCacheBillDetailList" />
  </wsdl:message>
  <wsdl:message name="GetCacheBillDetailListSoapOut">
    <wsdl:part name="parameters" element="tns:GetCacheBillDetailListResponse" />
  </wsdl:message>
  <wsdl:message name="GetPutOnRecordListSoapIn">
    <wsdl:part name="parameters" element="tns:GetPutOnRecordList" />
  </wsdl:message>
  <wsdl:message name="GetPutOnRecordListSoapOut">
    <wsdl:part name="parameters" element="tns:GetPutOnRecordListResponse" />
  </wsdl:message>
  <wsdl:message name="GetResultTypesSoapIn">
    <wsdl:part name="parameters" element="tns:GetResultTypes" />
  </wsdl:message>
  <wsdl:message name="GetResultTypesSoapOut">
    <wsdl:part name="parameters" element="tns:GetResultTypesResponse" />
  </wsdl:message>
  <wsdl:message name="UpDataHS_STATUSSoapIn">
    <wsdl:part name="parameters" element="tns:UpDataHS_STATUS" />
  </wsdl:message>
  <wsdl:message name="UpDataHS_STATUSSoapOut">
    <wsdl:part name="parameters" element="tns:UpDataHS_STATUSResponse" />
  </wsdl:message>
  <wsdl:message name="GetAppSettingsSoapIn">
    <wsdl:part name="parameters" element="tns:GetAppSettings" />
  </wsdl:message>
  <wsdl:message name="GetAppSettingsSoapOut">
    <wsdl:part name="parameters" element="tns:GetAppSettingsResponse" />
  </wsdl:message>
  <wsdl:message name="UpDataDetail_ZZZ_FlagSoapIn">
    <wsdl:part name="parameters" element="tns:UpDataDetail_ZZZ_Flag" />
  </wsdl:message>
  <wsdl:message name="UpDataDetail_ZZZ_FlagSoapOut">
    <wsdl:part name="parameters" element="tns:UpDataDetail_ZZZ_FlagResponse" />
  </wsdl:message>
  <wsdl:message name="UpDataClaimID_ZZZ_FlagSoapIn">
    <wsdl:part name="parameters" element="tns:UpDataClaimID_ZZZ_Flag" />
  </wsdl:message>
  <wsdl:message name="UpDataClaimID_ZZZ_FlagSoapOut">
    <wsdl:part name="parameters" element="tns:UpDataClaimID_ZZZ_FlagResponse" />
  </wsdl:message>
  <wsdl:message name="GetDATESoapIn">
    <wsdl:part name="parameters" element="tns:GetDATE" />
  </wsdl:message>
  <wsdl:message name="GetDATESoapOut">
    <wsdl:part name="parameters" element="tns:GetDATEResponse" />
  </wsdl:message>
  <wsdl:message name="DeleteNoAccountingRecordSoapIn">
    <wsdl:part name="parameters" element="tns:DeleteNoAccountingRecord" />
  </wsdl:message>
  <wsdl:message name="DeleteNoAccountingRecordSoapOut">
    <wsdl:part name="parameters" element="tns:DeleteNoAccountingRecordResponse" />
  </wsdl:message>
  <wsdl:message name="GetstdcodeSoapIn">
    <wsdl:part name="parameters" element="tns:Getstdcode" />
  </wsdl:message>
  <wsdl:message name="GetstdcodeSoapOut">
    <wsdl:part name="parameters" element="tns:GetstdcodeResponse" />
  </wsdl:message>
  <wsdl:message name="SavekfResonSoapIn">
    <wsdl:part name="parameters" element="tns:SavekfReson" />
  </wsdl:message>
  <wsdl:message name="SavekfResonSoapOut">
    <wsdl:part name="parameters" element="tns:SavekfResonResponse" />
  </wsdl:message>
  <wsdl:message name="SavekfWarnEnforcedSoapIn">
    <wsdl:part name="parameters" element="tns:SavekfWarnEnforced" />
  </wsdl:message>
  <wsdl:message name="SavekfWarnEnforcedSoapOut">
    <wsdl:part name="parameters" element="tns:SavekfWarnEnforcedResponse" />
  </wsdl:message>
  <wsdl:message name="SavekfWarnEnforced_newSoapIn">
    <wsdl:part name="parameters" element="tns:SavekfWarnEnforced_new" />
  </wsdl:message>
  <wsdl:message name="SavekfWarnEnforced_newSoapOut">
    <wsdl:part name="parameters" element="tns:SavekfWarnEnforced_newResponse" />
  </wsdl:message>
  <wsdl:message name="GetDiagnosisSoapIn">
    <wsdl:part name="parameters" element="tns:GetDiagnosis" />
  </wsdl:message>
  <wsdl:message name="GetDiagnosisSoapOut">
    <wsdl:part name="parameters" element="tns:GetDiagnosisResponse" />
  </wsdl:message>
  <wsdl:portType name="AuditWebServiceSoap">
    <wsdl:operation name="ClaimAudit4Hospital">
      <wsdl:input message="tns:ClaimAudit4HospitalSoapIn" />
      <wsdl:output message="tns:ClaimAudit4HospitalSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ClaimAudit4HospitalNewOne">
      <wsdl:input message="tns:ClaimAudit4HospitalNewOneSoapIn" />
      <wsdl:output message="tns:ClaimAudit4HospitalNewOneSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ClaimSave4Hospital">
      <wsdl:input message="tns:ClaimSave4HospitalSoapIn" />
      <wsdl:output message="tns:ClaimSave4HospitalSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ClaimUpdate4Hospital">
      <wsdl:input message="tns:ClaimUpdate4HospitalSoapIn" />
      <wsdl:output message="tns:ClaimUpdate4HospitalSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ClaimDelete4Hospital">
      <wsdl:input message="tns:ClaimDelete4HospitalSoapIn" />
      <wsdl:output message="tns:ClaimDelete4HospitalSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFullTips">
      <wsdl:input message="tns:GetFullTipsSoapIn" />
      <wsdl:output message="tns:GetFullTipsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRelatedDetail">
      <wsdl:input message="tns:GetRelatedDetailSoapIn" />
      <wsdl:output message="tns:GetRelatedDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRuleNames">
      <wsdl:input message="tns:GetRuleNamesSoapIn" />
      <wsdl:output message="tns:GetRuleNamesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLimitCodes">
      <wsdl:input message="tns:GetLimitCodesSoapIn" />
      <wsdl:output message="tns:GetLimitCodesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddPutOnRecord4Hospital">
      <wsdl:input message="tns:AddPutOnRecord4HospitalSoapIn" />
      <wsdl:output message="tns:AddPutOnRecord4HospitalSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddPutOnRecord4Hospital_N1">
      <wsdl:input message="tns:AddPutOnRecord4Hospital_N1SoapIn" />
      <wsdl:output message="tns:AddPutOnRecord4Hospital_N1SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DeletePutOnRecord4Hospital">
      <wsdl:input message="tns:DeletePutOnRecord4HospitalSoapIn" />
      <wsdl:output message="tns:DeletePutOnRecord4HospitalSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DeleteDetail4Hospital">
      <wsdl:input message="tns:DeleteDetail4HospitalSoapIn" />
      <wsdl:output message="tns:DeleteDetail4HospitalSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AuditCacheNotWithResult">
      <wsdl:input message="tns:AuditCacheNotWithResultSoapIn" />
      <wsdl:output message="tns:AuditCacheNotWithResultSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AuditCacheWithResult">
      <wsdl:input message="tns:AuditCacheWithResultSoapIn" />
      <wsdl:output message="tns:AuditCacheWithResultSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AuditCacheWithResult_ONE">
      <wsdl:input message="tns:AuditCacheWithResult_ONESoapIn" />
      <wsdl:output message="tns:AuditCacheWithResult_ONESoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetBillDetailList_ONE">
      <wsdl:input message="tns:GetBillDetailList_ONESoapIn" />
      <wsdl:output message="tns:GetBillDetailList_ONESoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AuditGetCostsResult">
      <wsdl:input message="tns:AuditGetCostsResultSoapIn" />
      <wsdl:output message="tns:AuditGetCostsResultSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Helloworld">
      <wsdl:input message="tns:HelloworldSoapIn" />
      <wsdl:output message="tns:HelloworldSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetbillList">
      <wsdl:input message="tns:GetbillListSoapIn" />
      <wsdl:output message="tns:GetbillListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetBillDetailList">
      <wsdl:input message="tns:GetBillDetailListSoapIn" />
      <wsdl:output message="tns:GetBillDetailListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCacheBillDetailList">
      <wsdl:input message="tns:GetCacheBillDetailListSoapIn" />
      <wsdl:output message="tns:GetCacheBillDetailListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPutOnRecordList">
      <wsdl:input message="tns:GetPutOnRecordListSoapIn" />
      <wsdl:output message="tns:GetPutOnRecordListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetResultTypes">
      <wsdl:input message="tns:GetResultTypesSoapIn" />
      <wsdl:output message="tns:GetResultTypesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpDataHS_STATUS">
      <wsdl:input message="tns:UpDataHS_STATUSSoapIn" />
      <wsdl:output message="tns:UpDataHS_STATUSSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAppSettings">
      <wsdl:input message="tns:GetAppSettingsSoapIn" />
      <wsdl:output message="tns:GetAppSettingsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpDataDetail_ZZZ_Flag">
      <wsdl:input message="tns:UpDataDetail_ZZZ_FlagSoapIn" />
      <wsdl:output message="tns:UpDataDetail_ZZZ_FlagSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpDataClaimID_ZZZ_Flag">
      <wsdl:input message="tns:UpDataClaimID_ZZZ_FlagSoapIn" />
      <wsdl:output message="tns:UpDataClaimID_ZZZ_FlagSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetDATE">
      <wsdl:input message="tns:GetDATESoapIn" />
      <wsdl:output message="tns:GetDATESoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DeleteNoAccountingRecord">
      <wsdl:input message="tns:DeleteNoAccountingRecordSoapIn" />
      <wsdl:output message="tns:DeleteNoAccountingRecordSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Getstdcode">
      <wsdl:input message="tns:GetstdcodeSoapIn" />
      <wsdl:output message="tns:GetstdcodeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SavekfReson">
      <wsdl:input message="tns:SavekfResonSoapIn" />
      <wsdl:output message="tns:SavekfResonSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SavekfWarnEnforced">
      <wsdl:input message="tns:SavekfWarnEnforcedSoapIn" />
      <wsdl:output message="tns:SavekfWarnEnforcedSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SavekfWarnEnforced_new">
      <wsdl:input message="tns:SavekfWarnEnforced_newSoapIn" />
      <wsdl:output message="tns:SavekfWarnEnforced_newSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetDiagnosis">
      <wsdl:input message="tns:GetDiagnosisSoapIn" />
      <wsdl:output message="tns:GetDiagnosisSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="AuditWebServiceSoap" type="tns:AuditWebServiceSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ClaimAudit4Hospital">
      <soap:operation soapAction="http://tempuri.org/ClaimAudit4Hospital" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClaimAudit4HospitalNewOne">
      <soap:operation soapAction="http://tempuri.org/ClaimAudit4HospitalNewOne" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClaimSave4Hospital">
      <soap:operation soapAction="http://tempuri.org/ClaimSave4Hospital" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClaimUpdate4Hospital">
      <soap:operation soapAction="http://tempuri.org/ClaimUpdate4Hospital" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClaimDelete4Hospital">
      <soap:operation soapAction="http://tempuri.org/ClaimDelete4Hospital" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFullTips">
      <soap:operation soapAction="http://tempuri.org/GetFullTips" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRelatedDetail">
      <soap:operation soapAction="http://tempuri.org/GetRelatedDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRuleNames">
      <soap:operation soapAction="http://tempuri.org/GetRuleNames" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLimitCodes">
      <soap:operation soapAction="http://tempuri.org/GetLimitCodes" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddPutOnRecord4Hospital">
      <soap:operation soapAction="http://tempuri.org/AddPutOnRecord4Hospital" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddPutOnRecord4Hospital_N1">
      <soap:operation soapAction="http://tempuri.org/AddPutOnRecord4Hospital_N1" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeletePutOnRecord4Hospital">
      <soap:operation soapAction="http://tempuri.org/DeletePutOnRecord4Hospital" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeleteDetail4Hospital">
      <soap:operation soapAction="http://tempuri.org/DeleteDetail4Hospital" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AuditCacheNotWithResult">
      <soap:operation soapAction="http://tempuri.org/AuditCacheNotWithResult" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AuditCacheWithResult">
      <soap:operation soapAction="http://tempuri.org/AuditCacheWithResult" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AuditCacheWithResult_ONE">
      <soap:operation soapAction="http://tempuri.org/AuditCacheWithResult_ONE" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBillDetailList_ONE">
      <soap:operation soapAction="http://tempuri.org/GetBillDetailList_ONE" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AuditGetCostsResult">
      <soap:operation soapAction="http://tempuri.org/AuditGetCostsResult" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Helloworld">
      <soap:operation soapAction="http://tempuri.org/Helloworld" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetbillList">
      <soap:operation soapAction="http://tempuri.org/GetbillList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBillDetailList">
      <soap:operation soapAction="http://tempuri.org/GetBillDetailList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCacheBillDetailList">
      <soap:operation soapAction="http://tempuri.org/GetCacheBillDetailList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPutOnRecordList">
      <soap:operation soapAction="http://tempuri.org/GetPutOnRecordList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetResultTypes">
      <soap:operation soapAction="http://tempuri.org/GetResultTypes" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpDataHS_STATUS">
      <soap:operation soapAction="http://tempuri.org/UpDataHS_STATUS" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAppSettings">
      <soap:operation soapAction="http://tempuri.org/GetAppSettings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpDataDetail_ZZZ_Flag">
      <soap:operation soapAction="http://tempuri.org/UpDataDetail_ZZZ_Flag" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpDataClaimID_ZZZ_Flag">
      <soap:operation soapAction="http://tempuri.org/UpDataClaimID_ZZZ_Flag" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDATE">
      <soap:operation soapAction="http://tempuri.org/GetDATE" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeleteNoAccountingRecord">
      <soap:operation soapAction="http://tempuri.org/DeleteNoAccountingRecord" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Getstdcode">
      <soap:operation soapAction="http://tempuri.org/Getstdcode" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SavekfReson">
      <soap:operation soapAction="http://tempuri.org/SavekfReson" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SavekfWarnEnforced">
      <soap:operation soapAction="http://tempuri.org/SavekfWarnEnforced" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SavekfWarnEnforced_new">
      <soap:operation soapAction="http://tempuri.org/SavekfWarnEnforced_new" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDiagnosis">
      <soap:operation soapAction="http://tempuri.org/GetDiagnosis" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="AuditWebServiceSoap12" type="tns:AuditWebServiceSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ClaimAudit4Hospital">
      <soap12:operation soapAction="http://tempuri.org/ClaimAudit4Hospital" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClaimAudit4HospitalNewOne">
      <soap12:operation soapAction="http://tempuri.org/ClaimAudit4HospitalNewOne" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClaimSave4Hospital">
      <soap12:operation soapAction="http://tempuri.org/ClaimSave4Hospital" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClaimUpdate4Hospital">
      <soap12:operation soapAction="http://tempuri.org/ClaimUpdate4Hospital" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClaimDelete4Hospital">
      <soap12:operation soapAction="http://tempuri.org/ClaimDelete4Hospital" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFullTips">
      <soap12:operation soapAction="http://tempuri.org/GetFullTips" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRelatedDetail">
      <soap12:operation soapAction="http://tempuri.org/GetRelatedDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRuleNames">
      <soap12:operation soapAction="http://tempuri.org/GetRuleNames" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLimitCodes">
      <soap12:operation soapAction="http://tempuri.org/GetLimitCodes" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddPutOnRecord4Hospital">
      <soap12:operation soapAction="http://tempuri.org/AddPutOnRecord4Hospital" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddPutOnRecord4Hospital_N1">
      <soap12:operation soapAction="http://tempuri.org/AddPutOnRecord4Hospital_N1" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeletePutOnRecord4Hospital">
      <soap12:operation soapAction="http://tempuri.org/DeletePutOnRecord4Hospital" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeleteDetail4Hospital">
      <soap12:operation soapAction="http://tempuri.org/DeleteDetail4Hospital" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AuditCacheNotWithResult">
      <soap12:operation soapAction="http://tempuri.org/AuditCacheNotWithResult" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AuditCacheWithResult">
      <soap12:operation soapAction="http://tempuri.org/AuditCacheWithResult" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AuditCacheWithResult_ONE">
      <soap12:operation soapAction="http://tempuri.org/AuditCacheWithResult_ONE" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBillDetailList_ONE">
      <soap12:operation soapAction="http://tempuri.org/GetBillDetailList_ONE" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AuditGetCostsResult">
      <soap12:operation soapAction="http://tempuri.org/AuditGetCostsResult" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Helloworld">
      <soap12:operation soapAction="http://tempuri.org/Helloworld" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetbillList">
      <soap12:operation soapAction="http://tempuri.org/GetbillList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBillDetailList">
      <soap12:operation soapAction="http://tempuri.org/GetBillDetailList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCacheBillDetailList">
      <soap12:operation soapAction="http://tempuri.org/GetCacheBillDetailList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPutOnRecordList">
      <soap12:operation soapAction="http://tempuri.org/GetPutOnRecordList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetResultTypes">
      <soap12:operation soapAction="http://tempuri.org/GetResultTypes" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpDataHS_STATUS">
      <soap12:operation soapAction="http://tempuri.org/UpDataHS_STATUS" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAppSettings">
      <soap12:operation soapAction="http://tempuri.org/GetAppSettings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpDataDetail_ZZZ_Flag">
      <soap12:operation soapAction="http://tempuri.org/UpDataDetail_ZZZ_Flag" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpDataClaimID_ZZZ_Flag">
      <soap12:operation soapAction="http://tempuri.org/UpDataClaimID_ZZZ_Flag" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDATE">
      <soap12:operation soapAction="http://tempuri.org/GetDATE" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeleteNoAccountingRecord">
      <soap12:operation soapAction="http://tempuri.org/DeleteNoAccountingRecord" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Getstdcode">
      <soap12:operation soapAction="http://tempuri.org/Getstdcode" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SavekfReson">
      <soap12:operation soapAction="http://tempuri.org/SavekfReson" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SavekfWarnEnforced">
      <soap12:operation soapAction="http://tempuri.org/SavekfWarnEnforced" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SavekfWarnEnforced_new">
      <soap12:operation soapAction="http://tempuri.org/SavekfWarnEnforced_new" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDiagnosis">
      <soap12:operation soapAction="http://tempuri.org/GetDiagnosis" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="AuditWebService">
    <wsdl:port name="AuditWebServiceSoap" binding="tns:AuditWebServiceSoap">
      <soap:address location="http://192.16.2.23/AuditWebService.asmx" />
    </wsdl:port>
    <wsdl:port name="AuditWebServiceSoap12" binding="tns:AuditWebServiceSoap12">
      <soap12:address location="http://192.16.2.23/AuditWebService.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>