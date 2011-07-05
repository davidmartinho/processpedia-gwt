package pt.ist.processpedia.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class CreateProcessViewImpl extends Composite implements CreateProcessView {

  public interface CreateProcessViewImplUiBinder extends UiBinder<Widget, CreateProcessViewImpl> {}
  private static CreateProcessViewImplUiBinder uiBinder = GWT.create(CreateProcessViewImplUiBinder.class);

  public CreateProcessViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
  }

}