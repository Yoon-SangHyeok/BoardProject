package com.spring.biz.board;

import java.util.List;

public interface BoardService {

	// CRUD ����� �޼ҵ� ����
	// �� ���
	void insertBoard(BoardVO vo);

	// �� ����
	void updateBoard(BoardVO vo);

	// �� ����
	void deleteBoard(BoardVO vo);
	
	// 조회수 추가
	void updateCnt(BoardVO vo);

	// �� �� ��ȸ
	BoardVO getBoard(BoardVO vo);

	// �� ��� ��ȸ
	List<BoardVO> getBoardList(BoardVO vo);

}