package com.sbexception.exception;

import java.time.LocalDateTime;

public class ExceptionBinding {

	     private String errCode;
	     
	     private String errMessage;
	     
	     private LocalDateTime ldt;

		public String getErrCode() {
			return errCode;
		}

		public void setErrCode(String errCode) {
			this.errCode = errCode;
		}

		public String getErrMessage() {
			return errMessage;
		}

		public void setErrMessage(String errMessage) {
			this.errMessage = errMessage;
		}

		public LocalDateTime getLdt() {
			return ldt;
		}

		public void setLdt(LocalDateTime ldt) {
			this.ldt = ldt;
		}
}

