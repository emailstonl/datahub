package com.linkedin.metadata.utils.elasticsearch;

import com.linkedin.data.template.RecordTemplate;
import com.linkedin.metadata.models.EntitySpec;
import javax.annotation.Nonnull;


/**
 * The convention for naming search indices
 */
public interface IndexConvention {
  @Nonnull
  String getIndexName(Class<? extends RecordTemplate> documentClass);

  @Nonnull
  String getIndexName(EntitySpec entitySpec);

  @Nonnull
  String getIndexName(String baseIndexName);
}
