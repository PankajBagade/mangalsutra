package com.sp2.mangalsutra.common.response;

import java.sql.Date;
import java.util.UUID;

public class WishlistResponseEntity {
	
	 private UUID id;
		
		private String requesterProfileId;
		
		private String requesteeProfileId;
		
		private String wishlistProfileId;
		
		private Date requestDate;
		
		private String unlockStatus;

		public UUID getId() {
			return id;
		}

		public void setId(UUID id) {
			this.id = id;
		}

		public String getRequesterProfileId() {
			return requesterProfileId;
		}

		public void setRequesterProfileId(String requesterProfileId) {
			this.requesterProfileId = requesterProfileId;
		}

		public String getRequesteeProfileId() {
			return requesteeProfileId;
		}

		public void setRequesteeProfileId(String requesteeProfileId) {
			this.requesteeProfileId = requesteeProfileId;
		}

		public String getWishlistProfileId() {
			return wishlistProfileId;
		}

		public void setWishlistProfileId(String wishlistProfileId) {
			this.wishlistProfileId = wishlistProfileId;
		}

		public Date getRequestDate() {
			return requestDate;
		}

		public void setRequestDate(Date requestDate) {
			this.requestDate = requestDate;
		}

		public String getUnlockStatus() {
			return unlockStatus;
		}

		public void setUnlockStatus(String unlockStatus) {
			this.unlockStatus = unlockStatus;
		}

		@Override
		public String toString() {
			return "WishlistRequestEntity [id=" + id + ", requesterProfileId="
					+ requesterProfileId + ", requesteeProfileId="
					+ requesteeProfileId + ", wishlistProfileId="
					+ wishlistProfileId + ", requestDate=" + requestDate
					+ ", unlockStatus=" + unlockStatus + "]";
		}

}
