package hsw.dao;

import java.util.List;

import hsw.vo.board.BoardVo;

public interface BoardDao {
	public List<BoardVo> boardList();
	public BoardVo boardContent(int bIndex);
}