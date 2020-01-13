package com.sy.security.config;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author sy
 * Date: 2020/1/13 16:43
 * @Description
 */
@Service("userDetailsService")
public class CustomUserDetailsService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println("-----业务处理");

        Collection<GrantedAuthority> authorities = new ArrayList<>();
        // 从数据库中取出用户信息


        // 判断用户是否存在
        if(s != "admin") {
            throw new UsernameNotFoundException("无权使用");
        }

        // 添加权限
        //List<SysUserRole> userRoles = userRoleService.listByUserId(user.getId());

      /*  for (SysUserRole userRole : userRoles) {
            SysRole role = roleService.selectById(userRole.getRoleId());*/
            authorities.add(new SimpleGrantedAuthority("admin"));
            authorities.add(new SimpleGrantedAuthority("todo"));
        //}

        // 返回UserDetails实现类
        return new User(s, "123", authorities);
    }
}
