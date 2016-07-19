<%--<div>
<h4>Dispatch Details </h4>
<form >

    <div class="panel panel-default col-lg-8 " >

        <div class="panel-body">
            <div class="form-group">
                <div class="input-group">
                    <span class="input-group-addon">Dispatch Name</span>
                    <input type="text" class="form-control" placeholder="dispatch manager" id="dispatch-name" required="">
                </div>
            </div>
            <div class="form-group">
                <div class="input-group">
                    <span class="input-group-addon">Description</span>
                    <input type="text" class="form-control" placeholder="dispatch manager" id="dispatch-descr" required="">
                </div>
            </div>

            <div class="form-group">
                <div class="input-group">
                    <span class="input-group-addon">Dispatch Manager</span>
                    <input type="text" class="form-control" placeholder="dispatch manager" id="dispatch-namager" required="">
                </div>
            </div>

        </div>
    </div>
  
</form>
<div class="col-lg-8">
<a class="btn btn-success"  onclick="dispatch.save()">Save</a>
</div>
</div>--%>

<div class="col-lg-12">
    <h4>Vehicle Dipatch Details</h4>
    <form class="form-horizontal"  enctype="multipart/form-data">

        <div class="form-group">
            <label for="inputVehicle1" class="col-sm-2 control-label">Vehicle*</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle1" placeholder="first name">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle2" class="col-sm-2 control-label">Client</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle2" placeholder="ID nO">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle3" class="col-sm-2 control-label">Return Date</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle3" placeholder="e.g Nairobi">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle4" class="col-sm-2 control-label">Document</label>
            <div class="col-sm-8">
                <input type="file"  id="inputVehicle4" >
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle5" class="col-sm-2 control-label">Comments</label>
            <div class="col-sm-8">
            <textarea class="form-control" rows="3" id="inputVehicle5"></textarea>
            </div>
        </div>


    </form>
    <div class="col-lg-10 pull-right">
        <a class="btn btn-success"  onclick="dispatch.save()">Save</a>
    </div>
</div>