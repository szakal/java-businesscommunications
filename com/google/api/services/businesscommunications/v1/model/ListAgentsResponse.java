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
 * A list of agents.
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
public final class ListAgentsResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of agent information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Agent> agents;

  static {
    // hack to force ProGuard to consider Agent used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Agent.class);
  }

  /**
   * The pagination token to retrieve the next page of results. If the value is "", it means no
   * further results for the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of agent information.
   * @return value or {@code null} for none
   */
  public java.util.List<Agent> getAgents() {
    return agents;
  }

  /**
   * List of agent information.
   * @param agents agents or {@code null} for none
   */
  public ListAgentsResponse setAgents(java.util.List<Agent> agents) {
    this.agents = agents;
    return this;
  }

  /**
   * The pagination token to retrieve the next page of results. If the value is "", it means no
   * further results for the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The pagination token to retrieve the next page of results. If the value is "", it means no
   * further results for the request.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListAgentsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListAgentsResponse set(String fieldName, Object value) {
    return (ListAgentsResponse) super.set(fieldName, value);
  }

  @Override
  public ListAgentsResponse clone() {
    return (ListAgentsResponse) super.clone();
  }

}
