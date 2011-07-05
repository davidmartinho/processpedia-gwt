package pt.ist.processpedia.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ProcesspediaViewImpl extends Composite implements ProcesspediaView {

  public interface ProcesspediaViewImplUiBinder extends UiBinder<Widget, ProcesspediaViewImpl> {}
  private static ProcesspediaViewImplUiBinder uiBinder = GWT.create(ProcesspediaViewImplUiBinder.class);

  public ProcesspediaViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
  }

}