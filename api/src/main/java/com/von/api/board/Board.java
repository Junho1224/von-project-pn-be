package com.von.api.board;

import lombok.Builder;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(exclude = {"id"})
public class Board {

    private Long id;
    private String boardName;
    private String boardType;



    @Builder(builderMethodName = "builder")
    public Board(Long id, String boardName, String boardType) {
        //this.id = id;
        this.boardName = boardName;
        this.boardType = boardType;
    }

}