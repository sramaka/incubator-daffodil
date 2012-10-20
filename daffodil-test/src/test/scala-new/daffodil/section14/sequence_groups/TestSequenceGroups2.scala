package daffodil.section14.sequence_groups

import junit.framework.Assert._
import org.scalatest.junit.JUnitSuite
import org.junit.Test
import scala.xml._
import daffodil.xml.XMLUtils
import daffodil.xml.XMLUtils._
import daffodil.compiler.Compiler
import daffodil.util._
import daffodil.tdml.DFDLTestSuite
import java.io.File

class TestSequenceGroups2 extends JUnitSuite {

  val testDir_01 = "/daffodil/section14/sequence_groups/"

  val tdml_02 = testDir_01 + "SequenceGroup.tdml"
  lazy val runner_02 = new DFDLTestSuite(Misc.getRequiredResource(tdml_02))

  @Test def test_SeqGrp_05() { runner_02.runOneTest("SeqGrp_05") }
}
