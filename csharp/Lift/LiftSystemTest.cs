using System.Collections.Generic;
using Xunit;

namespace Lift
{
    public class LiftSystemTest
    {
        // TODO: enable this test and finish writing it
        // [Fact]
        public void Something()
        {
            var liftA = new Lift("A", 0);
            var lifts = new LiftSystem(new List<int>(){0, 1}, new List<Lift>{liftA}, new List<Call>());
            lifts.Tick();
        }
    }
}
