package com.lynn;

public class TodoItem {
    public TodoItem(String name) {
        this.name = name;
    }

    private String name;

    private boolean hasDone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDone() {
        return hasDone;
    }

    public void setHasDone(boolean hasDone) {
        this.hasDone = hasDone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TodoItem)) return false;

        TodoItem todoItem = (TodoItem) o;

        if (isHasDone() != todoItem.isHasDone()) return false;
        return getName().equals(todoItem.getName());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + (isHasDone() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "name='" + name + '\'' +
                ", hasDone=" + hasDone +
                '}';
    }
}
