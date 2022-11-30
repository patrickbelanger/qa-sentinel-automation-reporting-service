package qa.free.tools.reporting.entities

import lombok.AllArgsConstructor
import qa.free.tools.reporting.types.TestResults
import java.time.LocalTime
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name="test_execution")
@AllArgsConstructor
data class TestExecution(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var methodName: String?,
    @Enumerated(EnumType.STRING)
    var testResult: TestResults?,
    var testUuid: String?,
    var runtime: String?,
    var executionStart: LocalTime?,
    var executionEnd: LocalTime?
)