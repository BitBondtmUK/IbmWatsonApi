// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.publish.RestServiceRequest;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * 
 */
public class getRequestHeader extends CustomJavaAction<String>
{
	private String headerName;

	public getRequestHeader(IContext context, String headerName)
	{
		super(context);
		this.headerName = headerName;
	}

	@Override
	public String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return RestServiceRequest.getRequestHeader(getContext(), headerName);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "getRequestHeader";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}