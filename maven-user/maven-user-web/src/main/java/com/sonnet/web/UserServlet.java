package com.sonnet.web;

import com.sonnet.pojo.User;
import com.sonnet.service.com.sonnet.service.UserService;
import com.sonnet.service.com.sonnet.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/show")
public class UserServlet extends HttpServlet {

    UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置向浏览器响应数据的类型和编码格式
        resp.setContentType("text/html;charset=utf-8");
        List<User> userList = userService.findAllUser();
        // 将list集合放在作用域
        req.setAttribute("list", userList);
        // 转发跳转到目标页面
        req.getRequestDispatcher("list.jsp").forward(req, resp);
    }
}
