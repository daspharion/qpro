package me.amvse.qpro.models;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "answers")
public class Answer {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @ManyToOne
  @JoinColumn(name="questionId", insertable = false, updatable = false)
  private Question question;

  @Column(name = "value", nullable = false, length = 512)
  private String value;

  @Column(name = "correct", nullable = false)
  private Boolean correct;

  @OneToMany
  @JoinColumn(name = "answerId")
  @OrderBy("id ASC")
  private List<AnswerSubmission> answerSumbissions = new ArrayList<>();

  public Answer () {}
  public Answer (String value, Boolean correct) {
    this.value = value;
    this.correct = correct;
  }

  public Long getId () { return this.id; }

  public Question getQuestion () { return this.question; }

  public String getValue () { return this.value; }
  public void setValue (String value) { this.value = value; }

  public Boolean getCorrect () { return this.correct; }
  public void setCorrect (Boolean correct) { this.correct = correct; }

  public List<AnswerSubmission> getAnswerSubmissions () { return this.answerSumbissions; }
  public void addAnswerSubmission (AnswerSubmission answerSubmission) { this.answerSumbissions.add(answerSubmission); }
}
