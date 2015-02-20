/**
 * (c) 2014 StreamSets, Inc. All rights reserved. May not
 * be copied, modified, or distributed in whole or part without
 * written consent of StreamSets, Inc.
 */
package com.streamsets.pipeline.stage.processor.splitter;

import com.streamsets.pipeline.api.Label;

public enum OnNotEnoughSplits implements Label {
  CONTINUE("Continue"),
  TO_ERROR("Send to Error"),

  ;

  private final String label;

  OnNotEnoughSplits(String label) {
    this.label = label;
  }

  @Override
  public String getLabel() {
    return label;
  }

}
