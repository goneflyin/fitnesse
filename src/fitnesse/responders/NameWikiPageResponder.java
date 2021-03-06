// Copyright (C) 2003-2009 by Object Mentor, Inc. All rights reserved.
// Released under the terms of the CPL Common Public License version 1.0.
package fitnesse.responders;

import fitnesse.wiki.WikiPage;

import java.util.Iterator;

public class NameWikiPageResponder extends BasicWikiPageResponder {
  protected String contentFrom(WikiPage requestedPage)
    throws Exception {
    StringBuffer contents = new StringBuffer();
    for (Iterator<?> iterator = requestedPage.getChildren().iterator(); iterator.hasNext();) {
      WikiPage child = (WikiPage) iterator.next();
      contents.append(child.getName() + Character.LINE_SEPARATOR);
    }
    return contents.toString();
  }

  protected String getContentType() {
    return "text/plain";
  }
}
