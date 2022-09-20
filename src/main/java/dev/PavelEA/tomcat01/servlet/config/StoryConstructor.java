package dev.PavelEA.tomcat01.servlet.config;

public class StoryConstructor {

    public static StoryMap create() {
        StoryMap storyMap = new StoryMap();

        StoryMap.Story prologue = new StoryMap.Story();
        prologue.setName("Prologue");
        storyMap.addStory(prologue);

        StoryMap.Story story1 = new StoryMap.Story();
        story1.setName("Story1");
        storyMap.addStory(story1);

        StoryMap.Story story2 = new StoryMap.Story();
        story2.setName("story2");
        storyMap.addStory(story2);

        StoryMap.Story story3 = new StoryMap.Story();
        story3.setName("story3");
        storyMap.addStory(story3);


        StoryMap.Story story4 = new StoryMap.Story();
        story4.setName("story4");
        storyMap.addStory(story4);


        StoryMap.Story story5 = new StoryMap.Story();
        story5.setName("story5");
        storyMap.addStory(story5);


        StoryMap.Story story6 = new StoryMap.Story();
        story6.setName("story6");
        storyMap.addStory(story6);

        StoryMap.Story story7 = new StoryMap.Story();
        story7.setName("story7");
        storyMap.addStory(story7);

        StoryMap.Story story8 = new StoryMap.Story();
        story8.setName("story8");
        storyMap.addStory(story8);

        prologue.addDoor(new StoryMap.Door(story1.getName()));

        story1.addDoor(new StoryMap.Door(story2.getName()));
        story1.addDoor(new StoryMap.Door(story3.getName()));
        story1.addDoor(new StoryMap.Door(story4.getName()));

        story2.addDoor(new StoryMap.Door(story5.getName()));
        story2.addDoor(new StoryMap.Door(story6.getName()));

        story3.addDoor(new StoryMap.Door(story7.getName()));
        story3.addDoor(new StoryMap.Door(story8.getName()));

        return storyMap;
    }
}
