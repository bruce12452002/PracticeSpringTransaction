package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.XxxDao;

@Service
//public class XxxServiceImpl {// implements XxxService {
public class XxxServiceImpl implements XxxService {
	@Autowired
	private XxxDao dao;

	@Override
	@Transactional
//	int update1() {
	public int update1() {
		int rtn = dao.update1();
		// throw new RuntimeException("我拋我拋我拋拋拋");
		System.out.println("rtn=" + rtn);
		return rtn;
	}

	@Override
	@Transactional
	public int update2() {
		dao.update2();
		return 0;
	}

}
