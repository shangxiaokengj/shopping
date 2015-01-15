package rj.ShoppingCart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderConfirm extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out=resp.getWriter();
		
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>达内电子商务门户</title>");
		out.println("		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
		out.println("		<meta name=\"description\" content=\"达内电子商务门户\">");
		out.println("		<link href=\"css/tarena.css\" rel=stylesheet>");
		out.println("	</head>");
		out.println("	<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\">");
		out.println("	");
		out.println("<!-- Header Start -->");
		out.println("");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"table2\">");
		out.println("			<tr>");
		out.println("				<td align=\"left\" width=\"7%\" background=\"images/top_bg.gif\"><img src=\"images/logo.gif\" width=\"286\" height=\"58\"></td>");
		out.println("				<td width=\"62%\" background=\"images/top_bg.gif\">　</td>");
		out.println("				<td width=\"31%\" background=\"images/top_bg.gif\" align=\"right\"><img src=\"images/top_r.gif\" width=\"352\" height=\"58\" border=\"0\"></td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
		out.println("			<tr>");
		out.println("				<td background=\"images/dh_bg.gif\" align=\"left\" height=\"12\">");
		out.println("					<table width=\"100\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.println("						<tr>");
		out.println("							<td width=\"5%\"></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"ProductList.PHP\"><img name=\"Image1\" border=\"0\" src=\"images/index.gif\" width=\"90\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"UserManage.PHP\"><img name=\"Image2\" border=\"0\" src=\"images/reg.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"ShoppingCart.PHP\"><img name=\"Image4\" border=\"0\" src=\"images/cart.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"Order.PHP\"><img name=\"Image5\" border=\"0\" src=\"images/order.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"ProductList.PHP\"><img name=\"Image6\" border=\"0\" src=\"images/exit.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("						</tr>");
		out.println("					</table>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" border=\"0\" width=\"98%\">");
		out.println("			<tr>");
		out.println("				<td width=\"65%\"><br>");
		out.println("					>> 欢迎访问 <b>达内电子商务门户</b>");
		out.println("				</td>");
		out.println("				<td width=\"35%\" align=\"right\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		");
		out.println("<!-- Header End -->");
		out.println("");
		out.println("<!-- Body Start -->");
		out.println("	<form>");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableBorder2\">");
		out.println("			<tr>");
		out.println("				<td height=\"25\" valign=\"middle\">");
		out.println("					<img src=\"images/Forum_nav.gif\" align=\"absmiddle\">");
		out.println("					<a href=\"ProductList\">达内电子商务门户</a> →&nbsp<img border=\"0\" src=\"images/dog.gif\" width=\"19\" height=\"18\">&nbsp订单确认");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		");
		out.println("		<br>");
		out.println("		");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableborder1\">");
		out.println("			<tr>");
		out.println("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"8%\" colspan=\"2\">");
		out.println("						<font color=\"#ffffff\" size=\"2pt\">");
		out.println("							<b>用户信息</b>");
		out.println("						</font>");
		out.println("						<input type=\"button\" value=\"修改\" onclick=\"javascript:window.location='UserModify.PHP';\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"right\" width=\"40%\">用户名&nbsp:&nbsp</td>");
		out.println("				<td class=tablebody1>tarena</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 align=\"right\">联系地址&nbsp:&nbsp</td>");
		out.println("				<td class=tablebody1>北京东路668号B区901室</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 align=\"right\">邮编&nbsp:&nbsp</td>");
		out.println("				<td class=tablebody1>200001</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 align=\"right\">家庭电话&nbsp:&nbsp</td>");
		out.println("				<td class=tablebody1>61202663</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 align=\"right\">办公室电话&nbsp:&nbsp</td>");
		out.println("				<td class=tablebody1>61202663</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 align=\"right\">手机&nbsp:&nbsp</td>");
		out.println("				<td class=tablebody1>13211161676</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 align=\"right\">Email地址&nbsp:&nbsp</td>");
		out.println("				<td class=tablebody1>zhouyu@tarena.com.cn</td>");
		out.println("			</tr>");
		out.println("		</table>		");
		out.println("		");
		out.println("		<br>");
		out.println("		");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableborder1\">");
		out.println("			<tr>");
		out.println("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"8%\" colspan=\"2\">");
		out.println("					<font color=\"#ffffff\" size=\"2pt\">");
		out.println("						<b>付款方式</b>");
		out.println("					</font>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 align=\"center\" width=\"40%\"></td>");
		out.println("				<td class=tablebody1>");
		out.println("					<select name=\"邮局汇款\">");
		out.println("						<option value=\"0\">邮局汇款</option>");
		out.println("						<option value=\"1\">银行转帐</option>");
		out.println("						<option value=\"2\">货到付款</option>");
		out.println("					</select>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		");
		out.println("		<br>");
		out.println("		");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableborder1\">");
		out.println("			<tr>");
		out.println("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"8%\" colspan=\"5\">");
		out.println("					<font color=\"#ffffff\" size=\"2pt\">");
		out.println("							<b>商品购物清单</b>");
		out.println("					</font>");
		out.println("					<input type=\"button\" value=\"修改\" onclick=\"javascript:window.location='Order.PHP';\" >");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 align=\"center\" width=\"3%\">1</td>");
		out.println("				<td class=tablebody1 width=\"52%\">精通Hibernate</td>");
		out.println("				<td class=tablebody2 width=\"15%\">价格&nbsp;:&nbsp;59.0</td>");
		out.println("				<td class=tablebody1 width=\"15%\">数量&nbsp;:&nbsp;1</td>");
		out.println("				<td class=tablebody2 width=\"15%\">小计&nbsp;:&nbsp;￥59</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 align=\"center\" width=\"3%\">2</td>");
		out.println("				<td class=tablebody1 width=\"52%\">中文版</td>");
		out.println("				<td class=tablebody2 width=\"15%\">价格&nbsp;:&nbsp;39.0</td>");
		out.println("				<td class=tablebody1 width=\"15%\">数量&nbsp;:&nbsp;2</td>");
		out.println("				<td class=tablebody2 width=\"15%\">小计&nbsp;:&nbsp;￥78</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody1 align=\"center\" colspan=\"4\"></td>");
		out.println("				<td class=tablebody1>合计&nbsp:&nbsp<font color=\"red\">￥137</font></td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		");
		out.println("		<br>");
		out.println("		");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" border=\"0\" width=\"98%\">");
		out.println("			<tr>");
		out.println("				<td width=\"65%\" align=\"center\">");
		out.println("					<b>请认真检查以上订单信息，确认无误后，点击&nbsp;→</b>");
		out.println("					<a href=\"Order.PHP\"><img border=\"0\" src=\"images/submit.gif\"></a>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		");
		out.println("		<br>");
		out.println("		</form>");
		out.println("<!-- Body End -->");
		out.println("");
		out.println("<!-- Footer Start -->");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" height=\"28\">");
		out.println("			<tr>");
		out.println("				<td height=\"17\" background=\"images/bot_bg.gif\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.println("			<tr>");
		out.println("				<td bgcolor=\"#f1f1f6\" height=\"53\" valign=\"center\">");
		out.println("					<p align=\"center\">");
		out.println("						Copyright &copy;2004 - 2005 <a href=\"http://www.tarena.com.cn\"><b>Tarena</b><font color=\"red\">.com.cn</font></a>");
		out.println("					</p>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("<!-- Footer End -->");
		out.println("");
		out.println("	</body>");
		
		out.close();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
	}

}
