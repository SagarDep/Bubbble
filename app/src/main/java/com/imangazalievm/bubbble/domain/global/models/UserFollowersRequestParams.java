package com.imangazalievm.bubbble.domain.global.models;

public class UserFollowersRequestParams {

    private long userId;
    private int page;
    private int pageSize;

    public UserFollowersRequestParams(long userId, int page, int pageSize) {
        this.userId = userId;
        this.page = page;
        this.pageSize = pageSize;
    }

    public long getUserId() {
        return userId;
    }

    public int getPage() {
        return page;
    }

    public int getPageSize() {
        return pageSize;
    }

}
