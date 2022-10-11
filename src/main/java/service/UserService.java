package service;

import domain.user.User;
import domain.user.dto.JoinReqDto;
import domain.user.dto.LoginReqDto;
import domain.user.dto.UpdateReqDto;

public class UserService {
	// 회원가입, 수정, 로그인, 로그아웃, 아이디 중복체크
	public int 회원가입(JoinReqDto dto) {

		return -1;
	}

	// select * from user inner join board or where username=? and password=?;
	public User 로그인(LoginReqDto dto) {

		return null;
	}

	public int 회원수정(UpdateReqDto dto) {
		return -1;
	}
}
