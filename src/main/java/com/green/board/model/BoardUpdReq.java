package com.green.board.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardUpdReq {
    private int boardId;
    private String title;
    private String contents;
    private String writer;
}
