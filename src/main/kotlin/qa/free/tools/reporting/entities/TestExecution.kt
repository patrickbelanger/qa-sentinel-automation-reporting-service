package qa.free.tools.reporting.entities

import qa.free.tools.reporting.types.TestResults
import java.time.LocalTime
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name="test_execution")
class TestExecution(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val methodName: String,
    @Enumerated(EnumType.STRING)
    val testResult: TestResults,
    val testUUID: UUID,
    val runtime: String,
    val executionStart: LocalTime,
    val executionEnd: LocalTime
)