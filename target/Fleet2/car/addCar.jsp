 <div class="col-lg-12">
    <h4>Register new Vehicle Details</h4>
    <form class="form-horizontal" enctype="multipart/form-data" method="POST" action="./fileUpload">

           <div class="form-group">
            <label for="inputVehicle1" class="col-sm-2 control-label">Vehicle Name*</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle1" name="carName" placeholder="vehicle nickname" required="">
            </div>
        </div>


        <div class="form-group">
            <label for="inputVehicle13"  class="col-sm-2 control-label">Owner</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle13" name="carOwner" placeholder="Vehicle Owner">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle2"  class="col-sm-2 control-label">VIN/SN</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle2" name="carVIN" placeholder="Vehicle Identification No">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle3"  class="col-sm-2 control-label">Type</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" name="carType" id="inputVehicle3" placeholder="vehicle type e.g. Bus">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle4"  class="col-sm-2 control-label">Year</label>
            <div class="col-sm-8">
                <input type="date" class="form-control" name="carYear" id="inputVehicle4" placeholder="Vehicle manufactured year">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle5" class="col-sm-2 control-label">Make</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" name="carMake" id="inputVehicle5" placeholder="e.g Toyota">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle6"  class="col-sm-2 control-label">Model</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" name="carModel" id="inputVehicle6" placeholder="e.g Salon">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle7"  class="col-sm-2 control-label">Licence Plate</label>
            <div class="col-sm-8">
                <input type="text" class="form-control"name="carLicence"  id="inputVehicle7" placeholder="e.g KBL 557H">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle8" class="col-sm-2 control-label">Registration Town</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" name="carRegistrationTown" id="inputVehicle8" placeholder="e.g Nairobi">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle10"  class="col-sm-2 control-label">Vehicle Color</label>
            <div class="col-sm-8">
                <input type="text" name="carColor" class="form-control" name="carVIN" id="inputVehicle10" placeholder="e.g Red">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle11" class="col-sm-2 control-label">MSRP</label>
            <div class="col-sm-8 input-group">
                <span class="input-group-addon">$$</span>
                <input type="text" class="form-control" name="carMSRP" placeholder="Manufacturer Suggested Resale Price" id="inputVehicle11" required="">
            </div>
        </div>
       <%-- <div class="form-group">
            <label for="inputVehicle12"  class="col-sm-2 control-label">Comments</label>
            <div class="col-sm-8">
                <input type="textarea" class="form-control" name="carType"  id="inputVehicle12" placeholder="Manufacturer Suggested Resele Price">
            </div>
        </div>--%>
<h4>Additional Details</h4>
        <div class="form-group">
            <label for="inputVehicle12" class="col-sm-2 control-label">Comment:</label>
            <div class="col-sm-8">
            <textarea class="form-control" rows="3" name="carComments" id="inputVehicle12"></textarea>
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle9" name="carPhoto" class="col-sm-2 control-label">Photo</label>
            <div class="col-sm-8">
                <input type="file"  name="carPhoto" id="inputVehicle9" >
            </div>
        </div>


<div class="col-lg-12">
<button type="submit" class="btn btn-success pull-right" ">Save</button>
</div>


    </form>


</div>

