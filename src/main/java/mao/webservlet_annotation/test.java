package mao.webservlet_annotation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Project name(项目名称)：WebServlet_annotation
 * Package(包名): mao.webservlet_annotation
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/20
 * Time(创建时间)： 21:21
 * Version(版本): 1.0
 * Description(描述)：
 * 在 Servlet 中，web.xml 扮演的角色十分的重要，它可以将所有的 Servlet 的配置集中进行管理，但是若项目中 Servelt 数量较多时，
 * web.xml 的配置会变得十分的冗长。这种情况下，注解（Annotation）就是一种更好的选择。
 * 与 XML 不同，注解不需要依赖于配置文件，它可以直接在类中使用，其配置只对当前类有效，这样就避免了集中管理造成的配置冗长问题
 * @WebServlet 注解的属性
 * @WebServlet 用于将一个类声明为 Servlet，该注解会在部署时被容器处理，容器根据其具体的属性配置将相应的类部署为 Servlet。
 * 该注解具有下表给出的一些常用属性。
 * 属性名	类型	标签	描述	是否必需
 * name	String	<servlet-name>	指定 Servlet 的 name 属性。
 * 如果没有显式指定，则取值为该 Servlet 的完全限定名，即包名+类名。	否
 * value	String[ ]	<url-pattern>	该属性等价于 urlPatterns 属性，两者不能同时指定。
 * 如果同时指定，通常是忽略 value 的取值。	是
 * urlPatterns	String[ ]	<url-pattern>	指定一组 Servlet 的 URL 匹配模式。	是
 * loadOnStartup	int	<load-on-startup>	指定 Servlet 的加载顺序。	否
 * initParams	WebInitParam[ ]	<init-param>	指定一组 Servlet 初始化参数。	否
 * asyncSupported	boolean	<async-supported>	声明 Servlet 是否支持异步操作模式。	否
 * description	String	<description>	指定该 Servlet 的描述信息。	否
 * displayName	String	<display-name>	指定该 Servlet 的显示名。	否
 *
 * @WebServlet 注解 和 web.xml 的优缺点
 * 使用 web.xml 或 @WebServlet 注解都可以配置 Servlet， 两者各有优缺点。
 * @WebServlet 注解配置 Servlet
 * 优点：@WebServlet 直接在 Servlet 类中使用，代码量少，配置简单。每个类只关注自身业务逻辑，与其他 Servlet 类互不干扰，适合多人同时开发。
 * 缺点：Servlet 较多时，每个 Servlet 的配置分布在各自的类中，不便于查找和修改。
 * web.xml 配置文件配置 Servlet
 * 优点：集中管理 Servlet 的配置，便于查找和修改。
 * 缺点：代码较繁琐，可读性不强，不易于理解。
 */

@WebServlet(asyncSupported = true, name = "myServlet", description = "描述", loadOnStartup = 1,
        urlPatterns = {"/MyServlet", "/*" },
        initParams = {
        @WebInitParam(name = "1", value = "www", description = "init参数1"),
        @WebInitParam(name = "1", value = "www.baidu.com", description = "init参数2") })
public class test extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        super.doPost(req, resp);
    }
}
