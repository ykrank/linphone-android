package org.linphone.purchase;

import java.util.Arrays;
import java.util.List;

public final class InAppConstants {
	//This needs to be changed so we fetch LinphonePreferences.instance().getInAppPurchasables() instead of hardcoding this.
	//This also means that we can't have specific actions for each subscription, which sucks, since we want to be able to switch from one to the other.
	public static final String SKU_YEARLY_SUB = "lck_android_1_year";
	public static final String SKU_MONTHLY_SUB = "test_account_subscription_2";
	private static final String[] SUBSCRIPTIONS_SKUS = {SKU_MONTHLY_SUB, SKU_YEARLY_SUB};

	private InAppConstants(){}

	/**
	 * Returns the list of all SKUs for the billing type specified
	 */
	public static final List<String> getSkuList() {
		return Arrays.asList(SUBSCRIPTIONS_SKUS);
	}
}
