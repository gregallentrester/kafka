package net.greg.examples.salient;

public class MoreSimpleModel {

  private String title;
  private String description;

  public MoreSimpleModel(String titleV, String descriptionV) {
    title = titleV;
    description = descriptionV;
  }

  public MoreSimpleModel() { }

  public String getTitle() { return title; }
  public void setTitle(String value) { title = value; }

  public String getDescription() { return description; }
  public void setDescription(String value) { description = value; }

  @Override
  public String toString() {
    return
      "MoreSimpleModel {" +
      "title='" + title + '\'' +
      ", description='" + description + '\'' +
      '}';
  }
}
