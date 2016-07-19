<%--<div>
<h4>Car Details </h4>
<form >

    <div class="panel panel-default col-lg-8 " >

        <div class="panel-body">
            <div class="form-group">
                <div class="input-group">
                    <span class="input-group-addon">Name</span>
                    <input type="text" class="form-control" placeholder="car name" id="car-name" required="">
                </div>
            </div>
            <div class="form-group">
                <div class="input-group">
                    <span class="input-group-addon">Comments</span>
                    <input type="textarea" class="form-control" placeholder="car owner" id="car-descr" required="">
                </div>
            </div>

            <div class="form-group">
                <div class="input-group">
                    <span class="input-group-addon">Owner</span>
                    <input type="text" class="form-control" placeholder="car owner" id="car-owner" required="">
                </div>
            </div>

        </div>
    </div>
</form>
</div>--%>


<div class="col-lg-12">
    <h4>Register new Vehicle Details</h4>
    <form class="form-horizontal">

        <div class="form-group">
            <label for="inputVehicle1" class="col-sm-2 control-label">Vehicle Name*</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle1" placeholder="vehicle nickname">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle13" class="col-sm-2 control-label">Owner</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle13" placeholder="Vehicle Owner">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle2" class="col-sm-2 control-label">VIN/SN</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle2" placeholder="Vehicle Identification No">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle3" class="col-sm-2 control-label">Type</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle3" placeholder="vehicle type e.g. Bus">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle4" class="col-sm-2 control-label">Year</label>
            <div class="col-sm-10">
                <input type="date" class="form-control" id="inputVehicle4" placeholder="Vehicle manufactured year">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle5" class="col-sm-2 control-label">Make</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle5" placeholder="e.g Toyota">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle6" class="col-sm-2 control-label">Model</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle6" placeholder="e.g Salon">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle7" class="col-sm-2 control-label">Licence Plate</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle7" placeholder="e.g KBL 557H">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle8" class="col-sm-2 control-label">Registration Town</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle8" placeholder="e.g Nairobi">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle10" class="col-sm-2 control-label">Vehicle Color</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle10" placeholder="e.g Red">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle11" class="col-sm-2 control-label">MSRP</label>
            <div class="col-sm-10 input-group">
                <span class="input-group-addon">$$</span>
                <input type="text" class="form-control" placeholder="Manufacturer Suggested Resale Price" id="inputVehicle11" required="">
            </div>
        </div>
       <%-- <div class="form-group">
            <label for="inputVehicle12" class="col-sm-2 control-label">Comments</label>
            <div class="col-sm-10">
                <input type="textarea" class="form-control" id="inputVehicle12" placeholder="Manufacturer Suggested Resele Price">
            </div>
        </div>--%>
<h4>Additional Details</h4>
        <div class="form-group">
            <label for="inputVehicle12" class="col-sm-2 control-label">Comment:</label>
            <div class="col-sm-8">
            <textarea class="form-control" rows="3" id="inputVehicle12"></textarea>
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle9" class="col-sm-2 control-label">Photo</label>
            <div class="col-sm-10">
                <input type="file"  id="inputVehicle9" >
            </div>
        </div>




    </form>
</div>
<div class="col-lg-12">
<a class="btn btn-success pull-right"  onclick="car.save()">Save</a>
</div>

</div>

