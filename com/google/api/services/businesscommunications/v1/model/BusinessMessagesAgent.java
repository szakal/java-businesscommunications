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
 * Agent information specific to Business Messages.
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
public final class BusinessMessagesAgent extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Additional agent interaction information. Enables the agent to support multiple
   * interaction types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SupportedAgentInteraction> additionalAgentInteractions;

  /**
   * Output only. The URL for testing the agent's conversational experience. Defined by the
   * platform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agentTestUrl;

  /**
   * Required. Conversational settings for an agent, mapped to a locale. Locale is represented by a
   * well-formed [IETF BCP 47](https://tools.ietf.org/html/bcp47) language tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, ConversationalSetting> conversationalSettings;

  /**
   * Optional. A partner-specified identifier for the agent. The identifier is passed alongside all
   * messages sent to the agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customAgentId;

  /**
   * Required. The default locale for the agent. Must match a locale defined in
   * `conversationalSettings`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultLocale;

  /**
   * Optional. List of entry point configurations. Not modifiable after agent verification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BusinessMessagesEntryPointConfig> entryPointConfigs;

  /**
   * Required. Publicly available URL of the logo for the agent. Maximum 50 KB. Not modifiable after
   * agent verification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logoUrl;

  /**
   * Optional. The phone number for the agent to display. If not specified, the agent displays the
   * phone number for the brand found in the [Google Knowledge
   * Graph](https://developers.google.com/knowledge-graph), if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Phone phone;

  /**
   * Required. Primary agent interaction information. Used when the user initiates a conversation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SupportedAgentInteraction primaryAgentInteraction;

  /**
   * Output only. URLs for testing the agent's conversational experience. Defined by the platform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TestUrl> testUrls;

  /**
   * Optional. Additional agent interaction information. Enables the agent to support multiple
   * interaction types.
   * @return value or {@code null} for none
   */
  public java.util.List<SupportedAgentInteraction> getAdditionalAgentInteractions() {
    return additionalAgentInteractions;
  }

  /**
   * Optional. Additional agent interaction information. Enables the agent to support multiple
   * interaction types.
   * @param additionalAgentInteractions additionalAgentInteractions or {@code null} for none
   */
  public BusinessMessagesAgent setAdditionalAgentInteractions(java.util.List<SupportedAgentInteraction> additionalAgentInteractions) {
    this.additionalAgentInteractions = additionalAgentInteractions;
    return this;
  }

  /**
   * Output only. The URL for testing the agent's conversational experience. Defined by the
   * platform.
   * @return value or {@code null} for none
   */
  public java.lang.String getAgentTestUrl() {
    return agentTestUrl;
  }

  /**
   * Output only. The URL for testing the agent's conversational experience. Defined by the
   * platform.
   * @param agentTestUrl agentTestUrl or {@code null} for none
   */
  public BusinessMessagesAgent setAgentTestUrl(java.lang.String agentTestUrl) {
    this.agentTestUrl = agentTestUrl;
    return this;
  }

  /**
   * Required. Conversational settings for an agent, mapped to a locale. Locale is represented by a
   * well-formed [IETF BCP 47](https://tools.ietf.org/html/bcp47) language tag.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, ConversationalSetting> getConversationalSettings() {
    return conversationalSettings;
  }

  /**
   * Required. Conversational settings for an agent, mapped to a locale. Locale is represented by a
   * well-formed [IETF BCP 47](https://tools.ietf.org/html/bcp47) language tag.
   * @param conversationalSettings conversationalSettings or {@code null} for none
   */
  public BusinessMessagesAgent setConversationalSettings(java.util.Map<String, ConversationalSetting> conversationalSettings) {
    this.conversationalSettings = conversationalSettings;
    return this;
  }

  /**
   * Optional. A partner-specified identifier for the agent. The identifier is passed alongside all
   * messages sent to the agent.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomAgentId() {
    return customAgentId;
  }

  /**
   * Optional. A partner-specified identifier for the agent. The identifier is passed alongside all
   * messages sent to the agent.
   * @param customAgentId customAgentId or {@code null} for none
   */
  public BusinessMessagesAgent setCustomAgentId(java.lang.String customAgentId) {
    this.customAgentId = customAgentId;
    return this;
  }

  /**
   * Required. The default locale for the agent. Must match a locale defined in
   * `conversationalSettings`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultLocale() {
    return defaultLocale;
  }

  /**
   * Required. The default locale for the agent. Must match a locale defined in
   * `conversationalSettings`.
   * @param defaultLocale defaultLocale or {@code null} for none
   */
  public BusinessMessagesAgent setDefaultLocale(java.lang.String defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

  /**
   * Optional. List of entry point configurations. Not modifiable after agent verification.
   * @return value or {@code null} for none
   */
  public java.util.List<BusinessMessagesEntryPointConfig> getEntryPointConfigs() {
    return entryPointConfigs;
  }

  /**
   * Optional. List of entry point configurations. Not modifiable after agent verification.
   * @param entryPointConfigs entryPointConfigs or {@code null} for none
   */
  public BusinessMessagesAgent setEntryPointConfigs(java.util.List<BusinessMessagesEntryPointConfig> entryPointConfigs) {
    this.entryPointConfigs = entryPointConfigs;
    return this;
  }

  /**
   * Required. Publicly available URL of the logo for the agent. Maximum 50 KB. Not modifiable after
   * agent verification.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogoUrl() {
    return logoUrl;
  }

  /**
   * Required. Publicly available URL of the logo for the agent. Maximum 50 KB. Not modifiable after
   * agent verification.
   * @param logoUrl logoUrl or {@code null} for none
   */
  public BusinessMessagesAgent setLogoUrl(java.lang.String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

  /**
   * Optional. The phone number for the agent to display. If not specified, the agent displays the
   * phone number for the brand found in the [Google Knowledge
   * Graph](https://developers.google.com/knowledge-graph), if any.
   * @return value or {@code null} for none
   */
  public Phone getPhone() {
    return phone;
  }

  /**
   * Optional. The phone number for the agent to display. If not specified, the agent displays the
   * phone number for the brand found in the [Google Knowledge
   * Graph](https://developers.google.com/knowledge-graph), if any.
   * @param phone phone or {@code null} for none
   */
  public BusinessMessagesAgent setPhone(Phone phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Required. Primary agent interaction information. Used when the user initiates a conversation.
   * @return value or {@code null} for none
   */
  public SupportedAgentInteraction getPrimaryAgentInteraction() {
    return primaryAgentInteraction;
  }

  /**
   * Required. Primary agent interaction information. Used when the user initiates a conversation.
   * @param primaryAgentInteraction primaryAgentInteraction or {@code null} for none
   */
  public BusinessMessagesAgent setPrimaryAgentInteraction(SupportedAgentInteraction primaryAgentInteraction) {
    this.primaryAgentInteraction = primaryAgentInteraction;
    return this;
  }

  /**
   * Output only. URLs for testing the agent's conversational experience. Defined by the platform.
   * @return value or {@code null} for none
   */
  public java.util.List<TestUrl> getTestUrls() {
    return testUrls;
  }

  /**
   * Output only. URLs for testing the agent's conversational experience. Defined by the platform.
   * @param testUrls testUrls or {@code null} for none
   */
  public BusinessMessagesAgent setTestUrls(java.util.List<TestUrl> testUrls) {
    this.testUrls = testUrls;
    return this;
  }

  @Override
  public BusinessMessagesAgent set(String fieldName, Object value) {
    return (BusinessMessagesAgent) super.set(fieldName, value);
  }

  @Override
  public BusinessMessagesAgent clone() {
    return (BusinessMessagesAgent) super.clone();
  }

}
