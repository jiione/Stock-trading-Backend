package com.KWdatabase.teamProject.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ItemCode {
    private String itemCode;
    private String itemName;
    private int likeNumber;
}
