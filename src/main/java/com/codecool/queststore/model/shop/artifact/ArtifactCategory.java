package com.codecool.queststore.model.shop.artifact;

public enum ArtifactCategory {

    PERSONAL ("personal"),
    GROUP("group");

    private final String CATEGORY;
    ArtifactCategory(String name) {
        this.CATEGORY = name;
    }

    public static ArtifactCategory getCategoryByName(String str) {
        switch (str) {
            case "personal":
                return PERSONAL;
            case "group":
                return GROUP;
            default:
                return null;
        }
    }

    public String getCATEGORY() {
        return CATEGORY; }
}

