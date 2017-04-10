package hsw.service;

import java.util.List;

import hsw.vo.board.BoardVo;

public interface BoardService {
	public List<BoardVo> list();
	public BoardVo contents(int bindx);
}
