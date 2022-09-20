package dev.PavelEA.tomcat01.servlet.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoryMap {
    private final Map<String, Story> stories = new HashMap<>();
    public void addStory(Story story) {
        stories.put(story.name, story);
    }
    public Story getStory(String name) {
        return stories.get(name);
    }

    public List<String> getNextRoomsNames(String story) {
        return stories.get(story)
                .getDoors()
                .stream()
                .map(Door::getRoomName)
                .toList();
    }

    public static class Story {
        private String name;
        private final List<Door> doors = new ArrayList<>();

        public void addDoor(Door door) {
            this.doors.add(door);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Door> getDoors() {
            return List.copyOf(this.doors);
        }





    }
public static class Door {
    private String roomName;

    public Door(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }



}
}

