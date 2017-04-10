package hsw.service.impl;

import java.util.List;

import hsw.dao.imple.BoardDaoImple;
import hsw.service.BoardService;
import hsw.vo.board.BoardVo;

public class BoardServiceImpl implements BoardService{
	private BoardDaoImple BoardDao = new BoardDaoImple();

	@Override
	public List<BoardVo> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVo contents(int bindx) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
