package uk.gov.ons.census.fwmt.events.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GatewayEventDTO implements Serializable {
  private String caseId;
  private String source;
  private String eventType;
  private LocalTime localTime;
  private Map<String, String> metadata;
}
