package com.morrison.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.morrison.beans.Employee;
import com.morrison.beans.ReimbursementRequest;
import com.morrison.service.RegisterReimbursements;

// TODO: Auto-generated Javadoc
/**
 * Servlet implementation class ReimbursementsBenco.
 */
public class ReimbursementsBenco extends HttpServlet {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Do get.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(
				"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n"
						+ "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n"
						+ "<script src=“https://code.jquery.com/jquery-1.10.2.js“></script>\r\n"
						+ "<script src=“https://code.jquery.com/ui/1.10.4/jquery-ui.js”></script>");
		List<ReimbursementRequest> rr = RegisterReimbursements.register(request);
		if ((rr != null) && !rr.isEmpty()) {
			Integer eid = rr.get(0).getEMP_ID();
			Employee e = RegisterReimbursements.getById(request);
			out.println("<div class = 'well'><h1>Reimbursement Requests</h1>");
			out.println(
					"<br>Below are the list of current Reimbursement Requests where EMP_ID = "
							+ eid + ":<br>");
			out.println(
					"<table border = '2px' class='table table-hover table-striped table-condensed'><tr><th>ID</th><th>EMP ID</th><th>COST</th>"
							+ "<th>EVENT TYPE</th><th>STATUS</th><th>TIMESTAMP</th><th>DATE</th><th>TIME OFF START DATE</th><th>TIME OFF END DATE</th><th>LOCATION</th><th>COVERED COST</th><th>ACTIONS</th></tr>");
			for (ReimbursementRequest r : rr) {
				out.println("<tr id ='" + r.getREIMBURSE_ID() + "'>" + "<td>"
						+ r.getREIMBURSE_ID() + "</td>" + "<td>" + r.getEMP_ID() + "</td>"
						+ "<td>$" + r.getREIMBURSE_COST() + "</td>" + "<td>"
						+ r.getREIMBURSE_EVENT_TYPE() + "</td>" + "<td>"
						+ r.getReimburse_status() + "</td>" + "<td>"
						+ r.getReimburse_timestamp() + "</td>" + "<td>" + r.getREIMBURSE_DATE()
						+ "</td>" + "<td>" + r.getTIMEOFF_START().toString() + "</td>" + "<td>"
						+ r.getTIMEOFF_END() + "</td>" + "<td>" + r.getREIMBURSE_LOCATION()
						+ "</td>" + "<td>$" + r.coveredCost() + "</td>" + "<td>"
						+ "<form action = 'ApproveStatusBenco'>"
						+ "<input type = 'hidden' name='rid' value =" + r.getREIMBURSE_ID()
						+ ">"
						+ "<button type = 'submit' class='btn btn-block center-block btn-primary btn-sm'>Approve"
						+ "</button>" + "</form>" + "<form action = 'DenyStatus'>"
						+ "<input type = 'hidden' name='rid' value =" + r.getREIMBURSE_ID()
						+ ">"
						+ "<button type = 'submit' class='btn btn-block center-block btn-primary btn-sm'>Deny"
						+ "</button>" + "</form>" + "</td>" + "</tr>");
			}
			out.println("</table></div>");
			out.println("<div class = 'well'><h1>Status</h1>");
			out.println(
					"<table border = '2px' class='table table-hover table-striped table-condensed'><tr><th>EMP ID</th><th>REPORTS TO</th>"
							+ "<th>DEPT NAME</th><th>RANK</th><th>CURRENT AID</th></tr>");
			out.println("<tr id ='" + e.getEid() + "'>" + "<td>" + e.getEid() + "</td>"
					+ "<td>" + e.getReportsto() + "</td>" + "<td>" + e.getDept_name() + "</td>"
					+ "<td>" + e.getRank() + "</td>" + "<td>" + e.getAid() + "</td></tr>");
			out.println("</table></div>");
		} else {
			out.println("<b>No requests found for given user.</b>");
		}
		out.println("<hr>" + "<a href='benco.html'>BACK</a>");
		out.close();
	}
	
	/**
	 * Do post.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
