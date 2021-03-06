package com.codecool.queststore.view;

import com.codecool.queststore.model.Title;
import com.codecool.queststore.model.classes.CodecoolClass;
import com.codecool.queststore.model.shop.artifact.Artifact;
import com.codecool.queststore.model.shop.quest.Quest;
import com.codecool.queststore.model.shop.quest.QuestTemplate;
import com.codecool.queststore.model.user.User;
import org.jtwig.JtwigModel;
import java.util.List;


interface TemplateModelInterface {
    JtwigModel getClassModel(User currentUser, List<CodecoolClass> classes);
    JtwigModel getClassModel(User currentUser, List<CodecoolClass> classes, CodecoolClass targetClass);
    JtwigModel getClassModel(User currentUser, List<CodecoolClass> classes, String message);
    JtwigModel getClassModel(User currentUser, List<CodecoolClass> classes, List<User> users, int classID);
    JtwigModel getProfileStudentModel(User currentUser, User profile, CodecoolClass ccClass, List<Artifact> items);
    JtwigModel getProfileMentorModel(User currentUser, User profile, List<CodecoolClass> classes);
    JtwigModel getProfileAdminModel(User currentUser, List<Title> titles);
    JtwigModel getStudentsListModel(User currentUser, List<User> users, boolean isCreated, List<CodecoolClass> classes);
    JtwigModel getMentorsListModel(User currentUser, List<User> users, boolean isCreated);
    JtwigModel getQuestModel(User currentUser, List<Quest> quests);
    JtwigModel getQuestTemplateModel(User currentUser, List<QuestTemplate> quests);
    JtwigModel getArtifactModel(User currentUser, List<Artifact> artifacts);
    JtwigModel getAddQuestTemplateModel(User currentUser);
    JtwigModel getAddClassModel(User currentUser);
}
