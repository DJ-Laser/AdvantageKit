// automatically generated by the FlatBuffers compiler, do not modify

package org.littletonrobotics.conduit.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.BooleanVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.DoubleVector;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.LongVector;
import com.google.flatbuffers.ShortVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Struct;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.UnionVector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class PDPData extends Struct {
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public PDPData __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int handle() { return bb.getInt(bb_pos + 0); }
  public void mutateHandle(int handle) { bb.putInt(bb_pos + 0, handle); }
  public int channelCount() { return bb.getInt(bb_pos + 4); }
  public void mutateChannelCount(int channel_count) { bb.putInt(bb_pos + 4, channel_count); }
  public int type() { return bb.getInt(bb_pos + 8); }
  public void mutateType(int type) { bb.putInt(bb_pos + 8, type); }
  public int moduleId() { return bb.getInt(bb_pos + 12); }
  public void mutateModuleId(int module_id) { bb.putInt(bb_pos + 12, module_id); }
  public long faults() { return (long)bb.getInt(bb_pos + 16) & 0xFFFFFFFFL; }
  public void mutateFaults(long faults) { bb.putInt(bb_pos + 16, (int) faults); }
  public long stickyFaults() { return (long)bb.getInt(bb_pos + 20) & 0xFFFFFFFFL; }
  public void mutateStickyFaults(long sticky_faults) { bb.putInt(bb_pos + 20, (int) sticky_faults); }
  public double temperature() { return bb.getDouble(bb_pos + 24); }
  public void mutateTemperature(double temperature) { bb.putDouble(bb_pos + 24, temperature); }
  public double voltage() { return bb.getDouble(bb_pos + 32); }
  public void mutateVoltage(double voltage) { bb.putDouble(bb_pos + 32, voltage); }
  public double channelCurrent(int j) { return bb.getDouble(bb_pos + 40 + j * 8); }
  public void mutateChannelCurrent(int j, double channel_current) { bb.putDouble(bb_pos + 40 + j * 8, channel_current); }
  public double totalCurrent() { return bb.getDouble(bb_pos + 232); }
  public void mutateTotalCurrent(double total_current) { bb.putDouble(bb_pos + 232, total_current); }
  public double totalPower() { return bb.getDouble(bb_pos + 240); }
  public void mutateTotalPower(double total_power) { bb.putDouble(bb_pos + 240, total_power); }
  public double totalEnergy() { return bb.getDouble(bb_pos + 248); }
  public void mutateTotalEnergy(double total_energy) { bb.putDouble(bb_pos + 248, total_energy); }

  public static int createPDPData(FlatBufferBuilder builder, int handle, int channelCount, int type, int moduleId, long faults, long stickyFaults, double temperature, double voltage, double[] channelCurrent, double totalCurrent, double totalPower, double totalEnergy) {
    builder.prep(8, 256);
    builder.putDouble(totalEnergy);
    builder.putDouble(totalPower);
    builder.putDouble(totalCurrent);
    for (int _idx0 = 24; _idx0 > 0; _idx0--) {
      builder.putDouble(channelCurrent[_idx0-1]);
    }
    builder.putDouble(voltage);
    builder.putDouble(temperature);
    builder.putInt((int) stickyFaults);
    builder.putInt((int) faults);
    builder.putInt(moduleId);
    builder.putInt(type);
    builder.putInt(channelCount);
    builder.putInt(handle);
    return builder.offset();
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public PDPData get(int j) { return get(new PDPData(), j); }
    public PDPData get(PDPData obj, int j) {  return obj.__assign(__element(j), bb); }
  }
}

