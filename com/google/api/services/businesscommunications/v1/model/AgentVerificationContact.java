/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2020-09-17 08:43:04 EDT)
 * on 2020-09-17 at 12:43:15 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.businesscommunications.v1.model;

/**
 * Verification contact details for an agent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Business Communications. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AgentVerificationContact extends com.google.api.client.json.GenericJson {

  /**
   * Required. The email address of the brand representative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String brandContactEmailAddress;

  /**
   * Required. Name of a brand representative who can verify the accuracy of the launch details and
   * that the partner represents the brand.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String brandContactName;

  /**
   * Required. The public website of the brand to verify the domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String brandWebsiteUrl;

  /**
   * Required. The email address of the partner.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String partnerEmailAddress;

  /**
   * Required. The name of the partner requesting the verification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String partnerName;

  /**
   * Required. The email address of the brand representative.
   * @return value or {@code null} for none
   */
  public java.lang.String getBrandContactEmailAddress() {
    return brandContactEmailAddress;
  }

  /**
   * Required. The email address of the brand representative.
   * @param brandContactEmailAddress brandContactEmailAddress or {@code null} for none
   */
  public AgentVerificationContact setBrandContactEmailAddress(java.lang.String brandContactEmailAddress) {
    this.brandContactEmailAddress = brandContactEmailAddress;
    return this;
  }

  /**
   * Required. Name of a brand representative who can verify the accuracy of the launch details and
   * that the partner represents the brand.
   * @return value or {@code null} for none
   */
  public java.lang.String getBrandContactName() {
    return brandContactName;
  }

  /**
   * Required. Name of a brand representative who can verify the accuracy of the launch details and
   * that the partner represents the brand.
   * @param brandContactName brandContactName or {@code null} for none
   */
  public AgentVerificationContact setBrandContactName(java.lang.String brandContactName) {
    this.brandContactName = brandContactName;
    return this;
  }

  /**
   * Required. The public website of the brand to verify the domain.
   * @return value or {@code null} for none
   */
  public java.lang.String getBrandWebsiteUrl() {
    return brandWebsiteUrl;
  }

  /**
   * Required. The public website of the brand to verify the domain.
   * @param brandWebsiteUrl brandWebsiteUrl or {@code null} for none
   */
  public AgentVerificationContact setBrandWebsiteUrl(java.lang.String brandWebsiteUrl) {
    this.brandWebsiteUrl = brandWebsiteUrl;
    return this;
  }

  /**
   * Required. The email address of the partner.
   * @return value or {@code null} for none
   */
  public java.lang.String getPartnerEmailAddress() {
    return partnerEmailAddress;
  }

  /**
   * Required. The email address of the partner.
   * @param partnerEmailAddress partnerEmailAddress or {@code null} for none
   */
  public AgentVerificationContact setPartnerEmailAddress(java.lang.String partnerEmailAddress) {
    this.partnerEmailAddress = partnerEmailAddress;
    return this;
  }

  /**
   * Required. The name of the partner requesting the verification.
   * @return value or {@code null} for none
   */
  public java.lang.String getPartnerName() {
    return partnerName;
  }

  /**
   * Required. The name of the partner requesting the verification.
   * @param partnerName partnerName or {@code null} for none
   */
  public AgentVerificationContact setPartnerName(java.lang.String partnerName) {
    this.partnerName = partnerName;
    return this;
  }

  @Override
  public AgentVerificationContact set(String fieldName, Object value) {
    return (AgentVerificationContact) super.set(fieldName, value);
  }

  @Override
  public AgentVerificationContact clone() {
    return (AgentVerificationContact) super.clone();
  }

}
