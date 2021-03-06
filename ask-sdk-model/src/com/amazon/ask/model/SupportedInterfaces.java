/*
* Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
* except in compliance with the License. A copy of the License is located at
*
* http://aws.amazon.com/apache2.0/
*
* or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
* the specific language governing permissions and limitations under the License.
*/


package com.amazon.ask.model;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object listing each interface that the device supports. For example, if supportedInterfaces includes AudioPlayer {}, then you know that the device supports streaming audio using the AudioPlayer interface.
 */

@JsonDeserialize(builder = SupportedInterfaces.Builder.class)
public final class SupportedInterfaces{

  @JsonProperty("AudioPlayer")
  private com.amazon.ask.model.interfaces.audioplayer.AudioPlayerInterface audioPlayer = null;

  @JsonProperty("Display")
  private com.amazon.ask.model.interfaces.display.DisplayInterface display = null;

  @JsonProperty("VideoApp")
  private com.amazon.ask.model.interfaces.videoapp.VideoAppInterface videoApp = null;

  public static Builder builder() {
    return new Builder();
  }

  private SupportedInterfaces(Builder builder) {
    this.audioPlayer = builder.audioPlayer;
    this.display = builder.display;
    this.videoApp = builder.videoApp;
  }

  /**
    * Get audioPlayer
  * @return audioPlayer
  **/
  public com.amazon.ask.model.interfaces.audioplayer.AudioPlayerInterface getAudioPlayer() {
    return audioPlayer;
  }

  /**
    * Get display
  * @return display
  **/
  public com.amazon.ask.model.interfaces.display.DisplayInterface getDisplay() {
    return display;
  }

  /**
    * Get videoApp
  * @return videoApp
  **/
  public com.amazon.ask.model.interfaces.videoapp.VideoAppInterface getVideoApp() {
    return videoApp;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedInterfaces supportedInterfaces = (SupportedInterfaces) o;
    return Objects.equals(this.audioPlayer, supportedInterfaces.audioPlayer) &&
        Objects.equals(this.display, supportedInterfaces.display) &&
        Objects.equals(this.videoApp, supportedInterfaces.videoApp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioPlayer, display, videoApp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedInterfaces {\n");
    
    sb.append("    audioPlayer: ").append(toIndentedString(audioPlayer)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    videoApp: ").append(toIndentedString(videoApp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static class Builder {
    private com.amazon.ask.model.interfaces.audioplayer.AudioPlayerInterface audioPlayer;
    private com.amazon.ask.model.interfaces.display.DisplayInterface display;
    private com.amazon.ask.model.interfaces.videoapp.VideoAppInterface videoApp;

    private Builder() { }

    @JsonProperty("AudioPlayer")
    public Builder withAudioPlayer(com.amazon.ask.model.interfaces.audioplayer.AudioPlayerInterface audioPlayer) {
      this.audioPlayer = audioPlayer;
      return this;
    }
      

    @JsonProperty("Display")
    public Builder withDisplay(com.amazon.ask.model.interfaces.display.DisplayInterface display) {
      this.display = display;
      return this;
    }
      

    @JsonProperty("VideoApp")
    public Builder withVideoApp(com.amazon.ask.model.interfaces.videoapp.VideoAppInterface videoApp) {
      this.videoApp = videoApp;
      return this;
    }
      

    public SupportedInterfaces build() {
      return new SupportedInterfaces(this);
    }
  }
}

