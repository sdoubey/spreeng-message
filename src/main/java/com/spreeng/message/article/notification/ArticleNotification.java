package com.spreeng.message.article.notification;

import java.util.List;
import java.util.UUID;

import com.spreeng.message.article.ArticleContent;
import com.spreeng.message.article.ArticleStatus;
import com.spreeng.message.article.ArticleVisibility;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class ArticleNotification implements LycorisSubjectMessage {

  @NonNull private UUID id;

  @NonNull private Long updateDateTime;

  @NonNull private Long creationDateTime;

  @NonNull private ArticleStatus status;

  @NonNull private ArticleVisibility visibility;

  @NonNull private UUID authorId;

  @NonNull private List<ArticleContent> content;
}
